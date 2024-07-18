package chaper02.movie.step01.pricing;

import chaper02.money.Money;
import chaper02.movie.step01.DiscountCondition;
import chaper02.movie.step01.DiscountPolicy;
import chaper02.movie.step01.Screening;

/**
 * 비율 할인 정책을 담당하는 클래스
 */
public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent; // 할인 비율

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
