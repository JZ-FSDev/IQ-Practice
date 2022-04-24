import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> stack;

    public ImplementQueueUsingStacks() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int item = temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return item;
    }
}    
