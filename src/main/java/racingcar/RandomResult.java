package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomResult {

    public static boolean movable() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= 4;
    }
}
