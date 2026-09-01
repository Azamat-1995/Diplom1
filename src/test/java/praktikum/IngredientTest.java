package praktikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    @Test void constructor_shouldSetAllFields() {
        IngredientType expectedType = IngredientType.FILLING;
        String expectedName = "cutlet";
        float expectedPrice = 100f;

        Ingredient ingredient = new Ingredient(expectedType, expectedName, expectedPrice);

        assertEquals(expectedType, ingredient.getType());
        assertEquals(expectedName, ingredient.getName());
        assertEquals(expectedPrice, ingredient.getPrice());
    }
}
