package CarRacingGame;

public class Output {

    public static void printExecutionResult() {
        System.out.println("실행결과");
    }

    public static void printWinner(String name) {
        System.out.println(name + "가 최종 우승했습니다.");
    }

    public static void println() {
        System.out.println();
    }

    public static void drawPosition(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        println();
    }

    public static void InputMismatchException() {
        System.out.println("유효하지 않은 값입니다.");
    }

    public static void printTermination() {
        System.out.println("시스템이 정상 종료되었습니다.");
    }

    public static void printExceptionMsg(String msg) {
        System.out.println(msg);
    }

}
