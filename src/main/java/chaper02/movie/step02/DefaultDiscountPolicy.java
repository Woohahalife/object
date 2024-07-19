package chaper02.movie.step02;

import chaper02.money.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 할인 정책을 담당하는 추상 클래스 - 템플릿 메서드 패턴 사용
 */
public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    // 하나의 할인 정책은 여러개의 할인 조건을 포함할 수 있음
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) { // Screening이 할인 조건을 만족시킬 경우 true
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            } // 할인 조건이 없는 경우 Money.ZERO 호출로 할인 금액이 0원이라는 사실을 전달하지만
              // 할인 정책이 없다는 사실 자체를 하나의 정책으로 표현하게 될 경우 개념 상 혼란이 올 수 있음
              // DefaultDiscountPolicy 에서도 0원을 전달하는데 굳이 할인 정책이 없다는 정책을 구현..? 이런 혼란이 올 수 있는데
              // 이에 대한 고민을 해봐야함
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening); // 실제 요금 계산 로직은 추상 메서드에 위임
}
