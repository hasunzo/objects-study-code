package chapter3;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type;

    private int sequence;           // 순번 조건에서만 사용

    private DayOfWeek dayOfWeek;    // 기간 조건에서만 사용
    private LocalTime startTime;    // 기간 조건에서만 사용
    private LocalTime endTime;      // 기간 조건에서만 사용
}
