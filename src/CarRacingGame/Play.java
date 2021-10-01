package CarRacingGame;

import java.util.ArrayList;
import java.util.List;

public class Play {

    Input input = new Input();
    Output output = new Output();

    private int INITIAL_PRICE = -1;

    public void proceed() {
        List<String> names = input.divideName(input.returnStringScanner());
        List<Car> cars = new ArrayList<>();
        int severalTimes = input.returnIntScanner();
        for (int i = 0; i < names.size(); i++) {
            Car car = new Car(names.get(i));
            cars.add(car);
        }
        output.printExecutionResult();
        showMoveDistance(severalTimes, cars);
        lookForWinner(cars, output);
    }

    private void showMoveDistance(int severalTimes, List<Car> cars) {
        for (int i = 0; i < severalTimes; i++) {
            for (int j = 0; j < cars.size(); j++) {
                cars.get(j).moveCar();
                cars.get(j).drawPosition();
            }
            output.println();
        }
    }

    private void lookForWinner(List<Car> cars, Output output) {
        String name = "";
        int max = INITIAL_PRICE;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPosition() == max) {
                name = name + ", " + cars.get(i).getName();
            }
            if (cars.get(i).getPosition() > max) {
                name = cars.get(i).getName();
                max = cars.get(i).getPosition();
            }
        }
        output.printWinner(name);
    }
}
