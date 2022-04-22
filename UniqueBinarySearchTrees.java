import java.math.BigInteger;

 /**
 * Self-written solution of "Unique Binary Search Trees" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class UniqueBinarySearchTrees {

    /**
     * Given an integer n, return the number of structurally unique BST's (binary
     * search trees) which has exactly n nodes of unique values from 1 to n.
     * 
     * @param n The number of vertices in the tree.
     * @return The number of structurally unique BSTs.
     */
    public int numTrees(int n) {
        return (choose(2 * n, n).divide(BigInteger.valueOf(n + 1))).intValue();
    }

    /**
     * Returns the value of n choose r.
     * 
     * @param n The number of items to choose from.
     * @param r The number of items to choose from n.
     * @return The value of n choose r.
     */
    private BigInteger choose(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    /**
     * Returns the value of n factorial.
     * 
     * @param n The number of the factorial to return.
     * @return The value of n factorial.
     */
    private BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = n; i > 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
