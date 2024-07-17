package chapter01.step02;

/**
 * 극장을 구현한 클래스
 * V2 : enter 메서드에서 TicketOffice에 접근해 티켓을 판매하는 코드를 TicketSeller 내부로 숨김
 */
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 관람객의 입장 로직 구현
    public void enter(Audience audience) {

        ticketSeller.sellTo(audience); // 세부 로직을 캡슐화
    }
}
