package chapter01.step01;

import chapter01.instance.Ticket;

/**
 * 극장을 구현한 클래스
 */
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 관람객의 입장 로직 구현
    public void enter(Audience audience) {

        if(audience.getBag().hasInvitation()) { // 가방 안에 초대장이 들어 있는지 확인
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();

            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();

            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());

            audience.getBag().setTicket(ticket);
        }
    }
}
