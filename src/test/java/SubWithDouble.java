import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubWithDouble {
    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown(){
        calculator = null;
    }

    @ParameterizedTest
    @CsvSource({"5.1, 3.1, 2", "17.5, 20.2, -2.7", "-3.3, -5.6, 2.3", "-2, 18.8, -20.8", "0, 0, 0"})
    public void subDoubleTest(double a, double b, double expectedResult) {
        double actualResult = calculator.sub(a, b);
        assertEquals(actualResult,expectedResult, 0.01,"");
    }
}
