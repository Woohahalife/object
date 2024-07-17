package chapter01.step03;

import chapter01.instance.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 티켓 판매소를 담당하는 클래스
 * 관람객은 해당 클래스에서 초대장을 티켓으로 교환하거나 구매함
 */
public class TicketOffice {

    private Long amount; // 티켓의 판매금액
    private List<Ticket> tickets = new ArrayList<>(); // 판매 & 교환할 티켓 목록

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    /*
        티켓의 selling 과정을 직접 수행하도록 구현
        TicketOffice와 Audience 사이에 의존 관계가 생겨버림
        TicketOffice가 Audience에게 직접 티켓을 판매하기 때문에 생긴 의존 관계
    */
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() { // 맨 첫번째 위치의 티켓을 반환
        return tickets.get(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
