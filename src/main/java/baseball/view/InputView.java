package baseball.view;

import baseball.constant.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String INPUT_RETRY_OR_QUIT_MESSAGE = "게임을 새로 시작하려면 %d, 종료하려면 %d를 입력하세요.%n";

    /**
     * 야구 숫자를 입력받을 때 사용하는 메서드
     */
    public static List<Integer> readNumber() {
        System.out.print(INPUT_NUMBER_MESSAGE);
        try {
            return input().codePoints()
                    .mapToObj(Character::getNumericValue)
                    .collect(Collectors.toList());
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException(ErrorMessage.NOT_VALID_NUMBER_TYPE.getMessage());
        }
    }

    /**
     * 게임 재시도, 종료 값 입력받을 때 사용하는 메서드
     * @param retry : 재시도 command
     * @param quit : 종료 command
     * @return game command
     */
    public static int readRetry(int retry, int quit) {
        System.out.printf(INPUT_RETRY_OR_QUIT_MESSAGE, retry, quit);
        int input = validateInteger(input());
        validateGameCommand(input, retry, quit);
        return input;
    }

    private static int validateInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_IS_EMPTY.getMessage());
        }
    }

    private static void validateGameCommand(int input, int retry, int quit) {
        if (input != retry || input != quit) {
            throw new IllegalArgumentException(ErrorMessage.NOT_VALID_GAME_COMMAND.getMessage());
        }
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
            throw new IllegalArgumentException(ErrorMessage.INPUT_IS_EMPTY.getMessage());
        }
    }

}
