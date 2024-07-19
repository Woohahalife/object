package chaper02.movie.step01.pricing;

import chaper02.money.Money;
import chaper02.movie.step01.DiscountPolicy;
import chaper02.movie.step01.Screening;

/**
 * 할인 정책이 없는 경우를 표현하는 클래스
 */
public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
