import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        preorderTraversal(root, list);
        return list;
    }
    
    private void preorderTraversal(Node root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            for(int i = 0; i < root.children.size(); i++){
                preorderTraversal(root.children.get(i), list);
            }
        }
    }
}
