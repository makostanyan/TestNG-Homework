import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultWithLong extends BaseClass {
    @Test(dataProvider = "ValuesForMult", groups = "longTypeTests")
    public void longSumTest(long a, long b, long expectedResult){
        long actualResult = calculator.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Calculator long mult is not correct");
    }

    @DataProvider(name = "ValuesForMult")
    public Object[][] valuesForMult(){
        return new Object[][]{
                {5, 10, 50},
                {-1, 15, -15},
                {15, -1, -15},
                {0, 0, 0},
                {-5, -10, 50}
        };
    }
}
