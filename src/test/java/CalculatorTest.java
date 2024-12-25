import org.example.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Assert equal test case")
    public void givenTwoIntegers_whenAddingTwoIntegers_thenReturnExpectedSummedInteger() {
        Assertions.assertEquals(4, calc.add(2, 2), () -> "Expected value is not equal as actual value!");
    }

    @Test
    @DisplayName("Assert not equal test case")
    public void givenTwoIntegers_whenAddingTwoIntegers_thenReturnUnexpectedSummedInteger() {
        Assertions.assertNotEquals(5, calc.add(2, 2), () -> "Expected value is equal as actual value!");
    }

    @Test
    @DisplayName("Assert array equal test case")
    public void givenTwoIntegerArrays_whenComparingTwoIntegerArrays_thenReturnTrue() {
        Assertions.assertArrayEquals(new int[] {1, 2, 3}, new int[] {1, 2, 3});
    }

    @Test
    @DisplayName("Assert not null test case")
    public void givenOneString_whenCheckingIfStringIsNotNull_thenReturnTrue() {
        String notNullString = "Some String";
        Assertions.assertNotNull(notNullString, () -> "Expected string is null!");
    }

}
