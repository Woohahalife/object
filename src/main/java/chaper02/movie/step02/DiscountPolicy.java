package chaper02.movie.step02;

import chaper02.money.Money;

/**
 * 할인 정책을 담당하는 인터페이스
 */
public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
