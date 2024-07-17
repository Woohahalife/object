package chapter01.step02;

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

    public Bag(Long amount) { // 초대장 없이 현금만 가진 경우
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) { // 초대장과 현금을 가진 경우
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
