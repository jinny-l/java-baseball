package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String INPUT_RETRY_OR_QUIT_MESSAGE = "게임을 새로 시작하려면 %d, 종료하려면 %d를 입력하세요.%n";

    /**
     * 숫자를 입력받을 때 사용하는 메서드
     */
    public static String readNumber() {
        System.out.print(INPUT_NUMBER_MESSAGE);
        return input();
    }

    /**
     * 게임 재시도, 종료 값 입력받을 때 사용하는 메서드
     * @param retry : 재시도 command
     * @param quit : 종료 command
     * @return game command
     */
    public static String readRetry(int retry, int quit) {
        System.out.printf(INPUT_RETRY_OR_QUIT_MESSAGE, retry, quit);
        return input();
    }

    /**
     * 사용자 입력을 받을 때 사용하는 메서드
     * @return 공백 여부를 검증한 값을 리턴
     */
    private static String input() {
        String input = Console.readLine().trim();
        validateHasInput(input);
        return input;
    }

    private static void validateHasInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

}
