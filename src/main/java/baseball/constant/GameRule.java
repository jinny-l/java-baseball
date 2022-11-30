package baseball.constant;

public enum GameRule {

    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱"),
    WINNING_CONDITION(String.format(
            "%d%s", BaseballNumber.LENGTH.getNumber(), STRIKE.message));

    private final String message;

    GameRule(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
