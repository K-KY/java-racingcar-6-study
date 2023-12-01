package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.model.InputValidator;

public class InputView {
    private InputValidator inputValidator = new InputValidator();
    public List<String> participants() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        return validateCarName(input);
    }

    private List<String> validateCarName(String input) {
        List<String> carNames = List.of(input.split(","));
        carNames.forEach(carName -> {
            inputValidator.invalidCarName(carName);
            inputValidator.nameLength(carName);
        });
        return carNames;
    }

    private int trialCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        inputValidator.trialCount(input);
        return Integer.parseInt(input);
    }
}