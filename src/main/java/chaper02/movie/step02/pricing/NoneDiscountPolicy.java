package chaper02.movie.step02.pricing;

import chaper02.money.Money;
import chaper02.movie.step02.DefaultDiscountPolicy;
import chaper02.movie.step02.DiscountPolicy;
import chaper02.movie.step02.Screening;

/**
 * 할인 정책이 없는 경우를 표현하는 클래스
 * DiscountPolicy 인터페이스를 구현하도록 설계해 DefaultDiscountPolicy 사용으로 인한 개념적 혼란 방지
 */
public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
