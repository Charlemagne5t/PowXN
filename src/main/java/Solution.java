import java.util.ArrayList;
import java.util.List;

public class Solution {
    public double myPow(double x, int n) {
        if(x == 1.0 && n != 0){
            return x;
        }
        if(n == 0){
            return 1.0;
        }
        double dealingWithMinInteger = 1.0;
        if(n == Integer.MIN_VALUE){
            n = n + 1;
            dealingWithMinInteger = x;
        }
        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double poweredX = x;
        int cutN = n;
        List<Double> leftOvers = new ArrayList<>();
        leftOvers.add(dealingWithMinInteger);
        int leftOver = 0;
        while (cutN > 0){
            leftOver = cutN % 2;
            if(leftOver != 0){
                leftOvers.add(poweredX);
            }
            poweredX *= poweredX;
            cutN /= 2;
        }
            double result = 1.0;
        for (int i = 0; i < leftOvers.size(); i++) {
            result *= leftOvers.get(i);
        }

        return result;
    }
}
