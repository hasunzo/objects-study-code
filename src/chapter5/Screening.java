package chapter5;

import java.time.LocalDateTime;

// 영화를 예매할 책임
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    // 예매하라 메시지에 응답할 수 있어야 한다
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
