import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    private Queue<Integer> queue;

    public ImplementStackUsingQueues() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int top() {
        int item = 0;
        Queue<Integer> temp = new LinkedList<Integer>();
        while(!queue.isEmpty()){
            item = queue.remove();
            temp.add(item);
        }
        queue = temp;
        return item;
    }
}    
