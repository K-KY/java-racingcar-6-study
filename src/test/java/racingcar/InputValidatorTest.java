package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.model.InputValidator;

public class InputValidatorTest {

    @Test
    void carNameValidateTest() {
        InputValidator inputValidator = new InputValidator();
        assertThatCode(() -> inputValidator.invalidCarName("pP가09")).doesNotThrowAnyException();
    }

    @Test
    void carNameExceptionTest() {
        InputValidator inputValidator = new InputValidator();
        assertThatThrownBy(() -> inputValidator.invalidCarName("!@")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void carNameLengthExceptionTest() {
        InputValidator inputValidator = new InputValidator();
        assertThatThrownBy(() -> inputValidator.nameLength("123456")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> inputValidator.nameLength("")).isInstanceOf(IllegalArgumentException.class);
        assertThatCode(() -> inputValidator.nameLength("qq")).doesNotThrowAnyException();
    }
}
