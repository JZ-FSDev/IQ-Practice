import java.util.ArrayList;
import java.util.List;

 /**
 * Self-written solution of "Binary Tree Paths" from LeetCode.
 * Faster than 52.95% of Java online submissions.
 * Less than 80.52% of Java online submissions.
 * 
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class BinaryTreePaths {

    public static void main(String[] args) {
        // Test the method
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        one.left = two;
        one.right = three;
        two.right = five;
        print(binaryTreePaths(one));
    }

    /**
     * Given the root of a binary tree, return all root-to-leaf paths in any order.
     * A leaf is a node with no children.
     * 
     * @param root The root of the binary tree.
     * @return The list of all root-to-leaf paths.
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> paths = new ArrayList<String>();
        binaryTreePathsHelper(root, "", paths);
        return paths;
    }

    /**
     * Recursively pre-order traverses through the given binary tree and 
     * adds a new path whenever a leaf is reached.
     * 
     * @param curr The current node.
     * @param s The current path as a String.
     * @param paths The list of all unique paths.
     */
    private static void binaryTreePathsHelper(TreeNode curr, String s, ArrayList<String> paths) {
        if (curr != null) {
            s += curr.val + "->";
            if (curr.left == null && curr.right == null) {
                paths.add(s.substring(0, s.length() - 2));
            }
            binaryTreePathsHelper(curr.left, s, paths);
            binaryTreePathsHelper(curr.right, s, paths);
        }
    }

    /**
     * Prints all the paths in the given list of paths.
     * 
     * @param paths The list of paths to print.
     */
    private static void print(List<String> paths) {
        for (String s : paths) {
            System.out.println(s);
        }
    }
}
