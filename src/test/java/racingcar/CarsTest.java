package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.model.Cars;

public class CarsTest {

    @Test
    void carsMoveTest() {
        Cars cars = new Cars("123,345,456");
        cars.indicate();
        cars.rolling();
        cars.indicate();
    }
}
