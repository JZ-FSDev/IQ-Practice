import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        one.left = two;
        one.right = three;
        two.right = five;
        print(binaryTreePaths(one));
    }
    
    public static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> paths = new ArrayList<String>();
        binaryTreePaths(root, "", paths);
        return paths;
    }
    
    private static void binaryTreePaths(TreeNode curr, String s, ArrayList<String> paths) {
        if (curr != null) {
            s += curr.val + "->";
            if (curr.left == null && curr.right == null) {
                paths.add(s.substring(0, s.length() - 2));
            }
            binaryTreePaths(curr.left, s, paths);
            binaryTreePaths(curr.right, s, paths);
        }
    }
    
    private static void print(List<String> paths) {
        for (String s : paths) {
            System.out.println(s);
        }
    }    
}    
   
