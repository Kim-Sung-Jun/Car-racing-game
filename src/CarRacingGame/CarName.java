package CarRacingGame;

import java.util.Arrays;
import java.util.List;

public class CarName {

    private static final String DELIMITER = ",";

    public List<String> divideName(String name) {
        return Arrays.asList(name.split(DELIMITER));
    }
}
