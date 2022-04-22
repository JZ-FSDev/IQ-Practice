import java.util.ArrayList;
import java.util.List;

/**
 * Self-written solution of "N-ary Tree Preorder Traversal" from LeetCode.
 * faster than 84.80% of Java online submissions.
 * 
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class NaryTreePreorderTraversal {

    /**
     * Given the root of an n-ary tree, return the preorder traversal of its nodes'
     * values.
     * Nary-Tree input serialization is represented in their level order traversal.
     * Each group of children is separated by the null value.
     * 
     * @param root The root of the tree.
     * @return Preoder traversal of the tree's nodes.
     */
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        preorderTraversal(root, list);
        return list;
    }

    /**
     * Helper method to populate the list of nodes during a preoder traversal.
     * 
     * @param root The root of the tree.
     * @param list The list to populate.
     */
    private void preorderTraversal(Node root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            for (int i = 0; i < root.children.size(); i++) {
                preorderTraversal(root.children.get(i), list);
            }
        }
    }
}
