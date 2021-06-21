import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumWithLong extends BaseClass{

    @Test(dataProvider = "ValuesForSum", groups = "longTypeTests")
    public void longSumTest(long a, long b, long expectedResult){
        long actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Calculator long sum is not correct");
    }

    @DataProvider(name = "ValuesForSum")
    public Object[][] valuesForSum(){
        return new Object[][]{
                {5, 10, 15},
                {-1, 15, 14},
                {15, -1, 14},
                {0, 0, 0},
                {-5, -10, -15}
        };
    }
}
