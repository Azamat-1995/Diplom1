package praktikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunTest {

    @Test
    void constructor_shouldSetNameAndPrice() {
        String expectedName = "black bun";
        float expectedPrice = 100f;

        Bun bun = new Bun(expectedName, expectedPrice);

        assertEquals(expectedName, bun.getName());
        assertEquals(expectedPrice, bun.getPrice());
    }
}
