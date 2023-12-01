package racingcar.view;

import java.util.List;
import java.util.StringJoiner;
import racingcar.model.Car;

public class OutputView {

    public void result(List<Car> result) {
        StringJoiner joiner = new StringJoiner(", " );
        result.forEach(res -> res.appendName(joiner));
        System.out.println("최종 우승자 : " + joiner);
    }
}
