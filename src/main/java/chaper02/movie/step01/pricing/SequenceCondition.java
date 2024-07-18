package chaper02.movie.step01.pricing;

import chaper02.movie.step01.DiscountCondition;
import chaper02.movie.step01.Screening;

/**
 * 순번 조건을 담당하는 클래스
 */
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // Screening의 상영 순번과 일치할 경우 true
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
