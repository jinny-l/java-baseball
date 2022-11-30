package baseball.constant;

/**
 * 야구 숫자 정보를 관리하는 클래스
 */
public enum BaseballNumber {

    LENGTH(3),
    START_INCLUSIVE(1),
    END_INCLUSIVE(9),
    BANNED_NUMBER(0);

    private final int number;

    BaseballNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
