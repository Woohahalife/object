package chaper02.movie.step01.pricing;

import chaper02.money.Money;
import chaper02.movie.step01.DiscountCondition;
import chaper02.movie.step01.DiscountPolicy;
import chaper02.movie.step01.Screening;

/**
 * 금액 할인 정책을 담당하는 클래스
 */
public class AmountDiscountPolicy extends DiscountPolicy {

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
