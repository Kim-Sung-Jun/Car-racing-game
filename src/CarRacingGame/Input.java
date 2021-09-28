package CarRacingGame;
//공백제거 고민중

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Input {

    private final int NAME_LENGTH_CRITERIA = 5;

    public String returnStringScanner() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = "";
        while (true) {
            try {
                carName = new Scanner(System.in).next();
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                continue;
            }
            return carName;
        }
    }

    //공백제거 고민중

    public int returnIntScanner() {
        System.out.println("시도할 회수는 몇회인가요?");
        int severalTimes = 0;
        while (true) {
            try {
                severalTimes = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 숫자입니다. 다시 숫자를 입력해주세요.");
                continue;
            }
            return severalTimes;
        }
    }

    public List<String> divideName(String name) {
        List<String> carNameArray = Arrays.asList(name.split(","));
        for (int i = 0; i < carNameArray.size(); i++) {
            if (carNameArray.get(i).length() > NAME_LENGTH_CRITERIA) {
                System.out.println("자동차 이름은 쉼표(,)를 기준으로 이름은 5자 이하만 가능합니다. 다시 값을 입력해주세요.");
                returnStringScanner();
            }
        }
        return carNameArray;
    }
}
