package baseball.model;

import baseball.constant.GameCommand;
import baseball.constant.GameRule;

public class BaseballGameService {

    private static final String WIN_CONDITION = GameRule.WINNING_CONDITION.getMessage();

    public boolean isWin(Baseball computer, Baseball player) {
        return computer.getResult(player).equals(WIN_CONDITION);
    }

    public boolean retry(int input) {
        return input == GameCommand.RETRY.getGameCommand();
    }

}
