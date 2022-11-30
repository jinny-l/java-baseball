package baseball.view;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String WIN_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"; //TODO: 매직넘버를 어떻게 받아올지 고려 필요
    private static final String END_MESSAGE = "게임이 종료되었습니다.";

    public static void printStart() {
        System.out.println(START_MESSAGE);
    }

    public static void printWin() {
        System.out.println(WIN_MESSAGE);
    }

    public static void printEnd() {
        System.out.println(END_MESSAGE);
    }

}
