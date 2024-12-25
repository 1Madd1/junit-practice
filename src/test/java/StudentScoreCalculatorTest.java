import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class StudentScoreCalculatorTest {
    private StudentScoreCalculator ssc;
    private static Object[] testValues() {
        return new Object[] {
                new Object[] {50, 50, 2500},
                new Object[] {-10, 50, -1},
                new Object[] {50, -1, -1},
                new Object[] {-1, -1, -1},
                new Object[] {150, 50, -1},
                new Object[] {50, 150, -1},
                new Object[] {150, 150, -1},
                new Object[] {0, 0, 0},
                new Object[] {100, 100, 10000}
        };
    }

    @Before
    public void setUp() {
        ssc = new StudentScoreCalculator();
    }
    @Test
    @Parameters(method = "testValues")
    public void givenArrayOfIntValues_whenCalculatingScores_thenReturnExpectedCalculatedScore(int mathsScore, int literacyScore, int expectedScore) {
        ssc.calculateSATScore(mathsScore, literacyScore);
        Assertions.assertEquals(expectedScore, ssc.getSATScore());
    }

}
