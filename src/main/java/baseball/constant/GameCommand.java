package baseball.constant;

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
