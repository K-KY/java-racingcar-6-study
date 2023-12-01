package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;

public class CarTest {

    @Test
    void carMoveTest() {
        Car car = new Car("asd");
        car.movable(true);
        System.out.println(car);
        assertThat(car.toString()).isEqualTo("asd : -");
    }
}
