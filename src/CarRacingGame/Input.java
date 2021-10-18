package CarRacingGame;
//공백제거 고민중

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return SCANNER.next();
    }

    public static String inputProgressCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return SCANNER.next();
    }
}