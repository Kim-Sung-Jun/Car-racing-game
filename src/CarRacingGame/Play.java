package CarRacingGame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Play {

    private static final int INITIAL_PRICE = -1;
    private static final int NAME_LENGTH_CRITERIA = 5;

    private final Input input = new Input();
    private final CarName carName = new CarName();

    public void proceed(Output output) throws InputMismatchException, ExceptionLength {
        List<String> names = carName.divideName(input.inputCarName());
        for (String name : names) {
            if (name.length() > NAME_LENGTH_CRITERIA) {
                throw new ExceptionLength();
            }
        }
        List<Car> cars = new ArrayList<>();
        int severalTimes = input.inputProgressCount();
        for (String name : names) {
            Car car = new Car(name);
            cars.add(car);
        }
        output.println();
        output.printExecutionResult();
        showMoveDistance(severalTimes, cars, output);
        lookForWinner(cars, output);
    }

    private void showMoveDistance(int severalTimes, List<Car> cars, Output output) {
        for (int i = 0; i < severalTimes; i++) {
            for (Car car : cars) {
                RandomNumbers randomNumbers = new RandomNumbers();
                car.moveCar(randomNumbers);
                output.drawPosition(car);
            }
            output.println();
        }
    }

    private void lookForWinner(List<Car> cars, Output output) {
        String name = "";
        int max = INITIAL_PRICE;
        for (Car car : cars) {
            if (car.getPosition() == max) {
                name = name + ", " + car.getName();
            }
            if (car.getPosition() > max) {
                name = car.getName();
                max = car.getPosition();
            }
        }
        output.printWinner(name);
    }
}
