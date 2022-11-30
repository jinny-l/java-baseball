package baseball.domain;

import baseball.constant.BaseballNumber;
import baseball.constant.ErrorMessage;
import java.util.ArrayList;
import java.util.List;

/**
 * 숫자 야구를 의미하는 객체
 */
public class Baseball {

    private List<Integer> baseball = new ArrayList<>();

    public Baseball(List<Integer> baseball) {
        validateLength(baseball);
        validateNotContainsZero(baseball);
        validateUnique(baseball);
        this.baseball = baseball;
    }

    public void validateLength(List<Integer> baseball) {
        if (baseball.size() != BaseballNumber.LENGTH.getNumber()) {
            throw new IllegalArgumentException(ErrorMessage.NOT_VALID_NUMBER_LENGTH.getMessage());
        }
    }

    public void validateNotContainsZero(List<Integer> baseball) {
        if (baseball.contains(BaseballNumber.NOT_CONTAINS_ZERO.getNumber())) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_CONTAINS_ZERO.getMessage());
        }
    }

    public void validateUnique(List<Integer> baseball) {
        if (baseball.size() != baseball.stream().distinct().count()) {
            throw new IllegalArgumentException(ErrorMessage.NOT_UNIQUE_NUMBER.getMessage());
        }
    }

}
