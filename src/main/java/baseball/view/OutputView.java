package baseball.view;

import baseball.constant.BaseballNumber;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String WIN_MESSAGE = "%s개의 숫자를 모두 맞히셨습니다! 게임 종료%n";
    private static final String END_MESSAGE = "게임이 종료되었습니다.";

    public static void printStart() {
        System.out.println(START_MESSAGE);
    }

    public static void printWin() {
        System.out.printf(WIN_MESSAGE, BaseballNumber.LENGTH.getNumber());
    }

    public static void printEnd() {
        System.out.println(END_MESSAGE);
    }

}
