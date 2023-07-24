import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void myPowTest1() {
        double x = 2.00000;
        int n = 10;
        double expected = 1024.00000;
        double actual = new Solution().myPow(x, n);
        double delta = 1e-5;

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void myPowTest2() {
        double x = 2.10000;
        int n = 3;
        double expected = 9.26100;
        double actual = new Solution().myPow(x, n);
        double delta = 1e-5;

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void myPowTest3() {
        double x = 2.00000;
        int n = -2;
        double expected = 0.25000;
        double actual = new Solution().myPow(x, n);
        double delta = 1e-5;

        Assert.assertEquals(expected, actual, delta);
    }
}
