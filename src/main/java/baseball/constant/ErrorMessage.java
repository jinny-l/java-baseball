package baseball.constant;

public enum ErrorMessage {

    INPUT_IS_EMPTY("입력 값이 없습니다."),
    NOT_VALID_NUMBER_TYPE("숫자가 아닌 값을 입력했습니다."),
    NOT_VALID_NUMBER_LENGTH("숫자는 3개만 입력 가능합니다."), // TODO: 매직 넘버 어떻게 상수화할지 고려 필요
    NUMBER_CONTAINS_ZERO("0은 입력할 수 없습니다."), // TODO: 매직 넘버 어떻게 상수화할지 고려 필요
    NOT_UNIQUE_NUMBER("중복된 숫자는 입력할 수 없습니다."),
    NOT_VALID_GAME_COMMAND(String.format(
            "%s 또는 %s만 입력 가능합니다.", GameCommand.RETRY.getGameCommand(), GameCommand.QUIT.getGameCommand()));
    private static final String END_MESSAGE = " 게임이 종료됩니다.";

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message + END_MESSAGE;
    }

}
