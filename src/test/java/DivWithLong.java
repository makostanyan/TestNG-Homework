import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivWithLong extends BaseClass{

    @Test(dataProvider = "ValuesForDiv", groups = "longTypeTests")
    public void longDivTest(long a, long b, double expectedResult){
        double actualResult =calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult, 0.01, "Calculator long div is not correct");
    }

    @DataProvider(name = "ValuesForDiv")
    public Object[][] valuesForDiv(){
        return new Object[][]{
                {44, 4, 11},
                {11, -11, -1},
                {-11, 11, -1},
                {5, 10, 0.5},
                {15, 0, 15}
        };
    }
}
