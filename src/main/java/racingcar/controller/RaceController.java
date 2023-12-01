package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceController {

    public void startRace() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Cars cars = new Cars(inputView.participants());
        race(inputView, cars);
        int maxCount = cars.findWinner();
        outputView.result(result(cars, maxCount));
    }

    private List<Car> result(Cars cars, int maxCount) {
        return cars.isWinner(maxCount);
    }

    private void race(InputView inputView, Cars cars) {
        int trialCount = inputView.trialCount();
        for (int i = 0; i < trialCount; i++) {
            cars.rolling();
            cars.indicate();
            System.out.println();
        }
    }
}
