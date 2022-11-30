package baseball.constant;

public enum BaseballNumber {

    LENGTH(3),
    START_INCLUSIVE(1),
    END_INCLUSIVE(9),
    BANNED_NUMBER(0);

    private int number;

    BaseballNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
