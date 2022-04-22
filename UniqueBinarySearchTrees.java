import java.math.BigInteger;

public class UniqueBinarySearchTrees{

    public int numTrees(int n) {
        return (choose(2 * n, n).divide(BigInteger.valueOf(n+1))).intValue();
    }

    private BigInteger choose(int n, int r){
        return factorial(n).divide(factorial(r).multiply(factorial(n-r)));
    }

    private BigInteger factorial(int n){
        BigInteger result = new BigInteger("1");
        for(int i = n; i > 1; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
