package chapter01.step03;

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

        return bag.hold(ticket);
    }
}
