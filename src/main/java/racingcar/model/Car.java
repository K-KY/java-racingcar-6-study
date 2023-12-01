package racingcar.model;

import racingcar.RandomResult;

public class Car {
    private final String carName;
    private int carMove = 0;

    public Car(String carName) {
        this.carName = carName;
    }

    public void movable(boolean movable) {
        if (movable) {
            carMove += 1;
        }
    }

    @Override
    public String toString() {
        return carName + " : " + "-".repeat(carMove);
    }
}
