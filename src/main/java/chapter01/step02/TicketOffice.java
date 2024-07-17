package chapter01.step02;

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

    public Ticket getTicket() { // 맨 첫번째 위치의 티켓을 반환
        return tickets.get(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
