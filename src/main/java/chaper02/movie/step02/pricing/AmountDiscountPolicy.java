package chaper02.movie.step02.pricing;

import chaper02.money.Money;
import chaper02.movie.step02.DiscountCondition;
import chaper02.movie.step02.DefaultDiscountPolicy;
import chaper02.movie.step02.Screening;

/**
 * 금액 할인 정책을 담당하는 클래스
 */
public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount; // 할인 요금

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
