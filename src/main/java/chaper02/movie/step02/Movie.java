package chaper02.movie.step02;

import chaper02.money.Money;

import java.time.Duration;

public class Movie {

    private String title; // 제목
    private Duration runningTime; // 상영 시간
    private Money fee; // 기본 요금
    private DiscountPolicy discountPolicy; // 할인 정책

    public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    // 실행 시점에 DiscountPolicy를 변경할 수 있도록 개선
    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {

        // 할인 정책이 없는 경우를 예외 케이스로 취급하기 때문에 일관성 있던 협력 방식이 무너짐
        // 할인 정책이 없는 경우 할인 금액이 0원이라는 사실을 결정하는 책임이 discountPolicy가 아닌
        // Movie쪽에 주어지기 때문
        // 책임의 위치를 결정하기 위해 조건문을 사용하는 것은 협력 설계 측면에서 좋지 않음
//        if(discountPolicy == null) {
//            return fee;
//        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
