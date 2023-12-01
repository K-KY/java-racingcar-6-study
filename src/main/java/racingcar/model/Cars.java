package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.RandomResult;

public class Cars {
    private List<Car> cars;

    public Cars(List<String> carNames) {
        cars = typeConverter(carNames);
    }

    private List<Car> typeConverter(List<String> carNames) {
        List<Car> car = new ArrayList<>();
        carNames.forEach(carName -> car.add(new Car(carName)));
        return car;
    }

    public void rolling() {
        cars.forEach(car -> car.movable(RandomResult.movable()));
    }

    public void indicate() {
        cars.forEach(car -> System.out.println(car.toString()));
    }

    public int findWinner() {
        return cars.stream()
                .map(car -> car.isGreaterThan(0))
                .mapToInt(x -> x)
                .max()
                .orElse(0);
    }

    public List<Car> isWinner(int maxCount) {
        List<Car> winner = cars.stream().filter(car -> car.isEqualCount(maxCount)).toList();
        return winner;
    }
}
