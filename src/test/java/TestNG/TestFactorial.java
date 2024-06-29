package TestNG;
import org.testng.annotations.Test;
import Factorial.Factorial;
import org.testng.Assert;


public class TestFactorial {

    @Test()
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }

    @Test()
    public void testFactorialPositive() {
        Assert.assertEquals(Factorial.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorial(-7);
    }
}