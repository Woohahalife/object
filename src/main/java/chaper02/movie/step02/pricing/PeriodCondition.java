package chaper02.movie.step02.pricing;

import chaper02.movie.step01.DiscountCondition;
import chaper02.movie.step01.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
               startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
               endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
