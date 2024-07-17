package chapter01.step02;

import chapter01.instance.Ticket;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return bag;
//    }

    // 관람객이 직접 가방 안의 초대장을 확인 & 직접 금액 지불
    public Long buy(Ticket ticket) {

        if(bag.hasInvitation()) { // 가방 안에 초대장이 들어 있는지 확인
            bag.setTicket(ticket);

            return 0L; // 반환금액 없음
        } else {

            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee()); // 보유 금액 차감

            return ticket.getFee(); // 티켓 구매 금액 반환
        }
    }
}
