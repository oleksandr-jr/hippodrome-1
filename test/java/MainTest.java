import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MainTest {
    @Test
    void getWinner() {
        List<Horse> horses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            horses.add(new Horse("name" + 1, i, i));
        }

        Hippodrome hippodrome = new Hippodrome(horses);

        assertSame(horses.get(9), hippodrome.getWinner());
    }

    @Test
    @Timeout(value = 22, unit = TimeUnit.SECONDS)
    void mainTimeTest() {
        try {
            Main.main(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
