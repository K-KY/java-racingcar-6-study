package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.RandomResult;

public class Cars {
    private List<Car> cars;

    public Cars(String participants) {
        cars = typeConverter(participants);
    }

    private List<Car> typeConverter(String participants) {
        List<Car> car = new ArrayList<>();
        List.of(participants.split(","))
                .forEach(participant -> car.add(new Car(participant)));
        return car;
    }

    public void rolling() {
        cars.forEach(car -> car.movable(RandomResult.movable()));
    }

    public void indicate() {
        cars.forEach(car -> System.out.println(car.toString()));
    }
}
