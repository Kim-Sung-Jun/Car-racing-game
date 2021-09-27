package CarRacingGame;

public class Car {

    private final int CONDITION_NUMBER = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveCar() {
        RandomNumbers randomNumbers = new RandomNumbers();
        if (CONDITION_NUMBER >=randomNumbers.makeRandomNumber()) {
            position += 1;
        }
    }

    public void drawPosition() {
        System.out.print(name + " : ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
