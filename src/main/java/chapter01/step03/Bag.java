package chapter01.step03;

import chapter01.instance.Invitation;
import chapter01.instance.Ticket;

/**
 * 관람객이 소지품을 보관할 클래스
 * 관람객이 들고올 수 있는 소지품을 보관할 용도로 가방을 들고 올 수 있다고 가정한 클래스
 */
public class Bag {

    // 가지고 올 수 있는 소지품을 필드로 작성
    private Long amount;
    private Invitation invitation; // 이벤트에 당첨되지 않은 관람객은 초대장을 가지고있지 않을 것
    private Ticket ticket;

    // bag에서 이루어지는 행위를 bag 스스로 수행하도록 구현
    public Long hold(Ticket ticket) {
        if(hasInvitation()) {
            setTicket(ticket);

            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());

            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
