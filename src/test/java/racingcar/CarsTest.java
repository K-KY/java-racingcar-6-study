package racingcar;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.model.Cars;

public class CarsTest {

    @Test
    void carsMoveTest() {
        Cars cars = new Cars(List.of("123,234,345"));
        cars.indicate();
        cars.rolling();
        cars.indicate();
    }
}
