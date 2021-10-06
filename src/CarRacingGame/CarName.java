package CarRacingGame;

import java.util.Arrays;
import java.util.List;

public class CarName {

    public List<String> divideName(String name) {
        List<String> carNameArray = Arrays.asList(name.split(","));
        return carNameArray;
    }
}
