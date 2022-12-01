package baseball.util;

import baseball.constant.BaseballNumber;
import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {

    public static final int SIZE = BaseballNumber.LENGTH.getNumber();
    private static final int START_INCLUSIVE = BaseballNumber.START_INCLUSIVE.getNumber();
    private static final int END_INCLUSIVE = BaseballNumber.END_INCLUSIVE.getNumber();

    public Baseball getBaseball() {
        return new Baseball(generate());
    }

    private List<Integer> generate() {
        List<Integer> baseball = new ArrayList<>();
        while (baseball.size() < SIZE) {
            int randomNumber = Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
            if (baseball.contains(randomNumber)) {
                continue;
            }
            baseball.add(randomNumber);
        }
        return baseball;
    }
}
