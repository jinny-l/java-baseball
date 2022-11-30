package baseball.constant;

public enum ErrorMessage {

    INPUT_IS_EMPTY("입력 값이 없습니다."),
    NOT_VALID_NUMBER_TYPE("숫자가 아닌 값을 입력했습니다."),
    NOT_VALID_NUMBER_LENGTH(String.format(
            "숫자는 %s개만 입력 가능합니다.",
            BaseballNumber.LENGTH.getNumber())),
    NUMBER_CONTAINS_BANNED_NUMBER(String.format(
            "%s은 입력할 수 없습니다.",
            BaseballNumber.BANNED_NUMBER.getNumber())),
    NOT_UNIQUE_NUMBER("중복된 숫자는 입력할 수 없습니다."),
    NOT_VALID_GAME_COMMAND(String.format(
            "%s 또는 %s만 입력 가능합니다.",
            GameCommand.RETRY.getGameCommand(),
            GameCommand.QUIT.getGameCommand()));
    private static final String END_MESSAGE = " 게임이 종료됩니다.";

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message + END_MESSAGE;
    }

}
