package chaper02.movie.step01.pricing;

import chaper02.movie.step01.DiscountCondition;
import chaper02.movie.step01.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 기간 조건을 담당하는 클래스
 */
public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek; // 요일
    private LocalTime startTime; // 시작 시간
    private LocalTime endTime; // 종료 시간

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Screening의 상영 요일이 dayOfWeek와 같고 상영 시작 시간이 startTime과 endTime 사이에 있는 경우 true
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
               startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
               endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
