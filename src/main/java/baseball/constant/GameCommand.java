package baseball.constant;

/**
 * 게임 명령어를 관리하는 클래스
 */
public enum GameCommand {

    RETRY(1),
    QUIT(2);

    private final int gameCommand;

    GameCommand(int gameCommand) {
        this.gameCommand = gameCommand;
    }

    public int getGameCommand() {
        return gameCommand;
    }

}
