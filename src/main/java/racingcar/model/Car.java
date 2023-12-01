package racingcar.model;

import java.util.StringJoiner;

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

    public int isGreaterThan(int winnerCount) {
        return Math.max(winnerCount, carMove);
    }

    public boolean isEqualCount(int maxCount) {
        return maxCount == carMove;
    }

    public void appendName(StringJoiner sb) {
        sb.add(carName);
    }
}
