import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumWithDouble extends BaseClass {
    @Test(dataProvider = "ValuesForSum")
    public void doubleSumTest(double a, double b, double expectedResult){
        double actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult, 0.01,  "Calculator double sum is not correct");
    }

    @DataProvider(name = "ValuesForSum")
    public Object[][] valuesForSum(){
        return new Object[][]{
                {3.5, 4.5, 8},
                {-1.2, 5.6, 4.4},
                {5.6, -1.2, 4.4},
                {0.0, 0.0, 0.0},
                {-5.1, -10.6, -15.7}
        };
    }
}
