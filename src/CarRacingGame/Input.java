package CarRacingGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String returnStringScanner() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return scanner.next();
    }

    public int returnIntScanner() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

    public List<String> divideName(String name) {
        List<String> carNameArray = Arrays.asList(name.split(","));
        return carNameArray;
    }
}
