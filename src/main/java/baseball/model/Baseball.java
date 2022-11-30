package baseball.model;

import baseball.constant.BaseballNumber;
import baseball.constant.ErrorMessage;
import baseball.constant.GameRule;
import java.util.ArrayList;
import java.util.List;

/**
 * 숫자 야구를 의미하는 객체
 */
public class Baseball {

    private static final String STRIKE = GameRule.STRIKE.getMessage();
    private static final String BALL = GameRule.BALL.getMessage();
    private static final String NOTHING = GameRule.NOTHING.getMessage();
    private static final int ZERO = 0;

    private final List<Integer> baseball;

    public Baseball(List<Integer> baseball) {
        validateLength(baseball);
        validateNumber(baseball);
        validateUnique(baseball);
        this.baseball = baseball;
    }

    /**
     * 숫자 야구 결과를 확인할 때 사용하는 메서드
     * @param compare : 정답을 비교할 Baseball 객체
     * @return 결과
     */
    public String getResult(Baseball compare) {
        int sameCount = countSame(compare);
        int strikeCount = countStrike(compare);
        int ballCount = countBall(compare);
        if (sameCount == ZERO) {
            return NOTHING;
        }
        if (strikeCount == ZERO) {
            return ballCount + BALL;
        }
        if (ballCount == ZERO) {
            return strikeCount + STRIKE;
        }
        return ballCount + BALL + " " + strikeCount + STRIKE;
    }

    private int countBall(Baseball compare) {
        return countSame(compare) - countStrike(compare);
    }

    private int countStrike(Baseball compare) {
        int count = 0;
        for (int i = 0; i < compare.size(); i++) {
            if (baseball.get(i).equals(compare.getBaseball().get(i))) {
                count++;
            }
        }
        return count;
    }

    private int countSame(Baseball compare) {
        List<Integer> count = new ArrayList<>(baseball);
        count.retainAll(compare.getBaseball());
        return count.size();
    }

    private List<Integer> getBaseball() {
        return baseball;
    }

    private int size() {
        return baseball.size();
    }

    /**
     * 유효성 검증할 때 사용하는 메서드
     * @param baseball : 검증이 필요한 입력 값
     */
    private void validateLength(List<Integer> baseball) {
        if (baseball.size() != BaseballNumber.LENGTH.getNumber()) {
            throw new IllegalArgumentException(ErrorMessage.NOT_VALID_NUMBER_LENGTH.getMessage());
        }
    }

     private void validateNumber(List<Integer> baseball) {
        if (baseball.contains(BaseballNumber.BANNED_NUMBER.getNumber())) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_CONTAINS_BANNED_NUMBER.getMessage());
        }
    }

    private void validateUnique(List<Integer> baseball) {
        if (baseball.size() != baseball.stream().distinct().count()) {
            throw new IllegalArgumentException(ErrorMessage.NOT_UNIQUE_NUMBER.getMessage());
        }
    }

}
