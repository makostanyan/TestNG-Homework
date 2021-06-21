import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultWithDouble extends BaseClass {

        @Test(dataProvider = "ValuesForMult")
        public void doubleMultTest(double a, double b, double expectedResult){
            double actualResult = calculator.mult(a, b);
            Assert.assertEquals(actualResult, expectedResult,0.01, "Calculator double mult is not correct");
        }

        @DataProvider(name = "ValuesForMult")
        public Object[][] valuesForMult(){
            return new Object[][]{
                    {5.1, 10, 51},
                    {-1.2, 15.6, -18.72},
                    {15.6, -1.2, -18.72},
                    {0, 0, 0},
                    {-5.1, -10, 51}
            };
        }
    }
