package chaper02.movie.step01;

import chaper02.money.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 할인 정책을 담당하는 추상 클래스 - 템플릿 메서드 패턴 사용
 */
public abstract class DiscountPolicy {

    // 하나의 할인 정책은 여러개의 할인 조건을 포함할 수 있음
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) { // Screening이 할인 조건을 만족시킬 경우 true
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening); // 실제 요금 계산 로직은 추상 메서드에 위임
}
