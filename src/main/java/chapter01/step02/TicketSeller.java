package chapter01.step02;

/**
 * 티켓 판매자를 담당하는 클래스
 * 티켓 판매 로직을 직접 구현 ( sellTo() )
 */
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // 티켓을 TicketSeller가 직접 판매
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket())); // 티켓 구매 금액에 따라 office의 보유 금액 증액
    }
}
