package racingcar.model;

public class InputValidator {
    private static final String REGEX = "[a-zA-Z가-힣0-9가]+";

    public void invalidCarName(String carName) {
        if (!carName.matches(REGEX)) {
            throw new IllegalArgumentException("[ERROR] 허용되지 않는 문자가 포함되어 있습니다");
        }
    }

    public void nameLength(String carName) {
        int nameLength = carName.strip().length();
        if (nameLength > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름의 최대 길이는 5자입니다.");
        }

        if (nameLength < 1) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름을 입력 해주세요.");
        }
    }

}
