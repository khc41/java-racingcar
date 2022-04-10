package racingcar.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String INPUT_CAR_COUNT_MESSAGE = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_CAR_MOVE_COUNT_MESSAGE = "시도할 회수는 몇 회 인가요?";

    private InputView() throws InstantiationException {
        throw new InstantiationException();
    }

    public static int inputCarCount() {
        System.out.println(INPUT_CAR_COUNT_MESSAGE);

        return inputInt();
    }

    public static int inputCarMoveCount() {
        System.out.println(INPUT_CAR_MOVE_COUNT_MESSAGE);

        return inputInt();
    }

    private static int inputInt() {
        return SCANNER.nextInt();
    }
}
