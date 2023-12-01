package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RandomResultTest {

    @Test
    void movableTest() {
        assertThat(RandomResult.movable()).isIn(true, false);
    }
}
