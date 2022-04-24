import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] path = new int[n*3];
        int items = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean d = (source == destination);
        queue.add(source);
        while(!queue.isEmpty() && !d){
            int temp = queue.remove();
            path[items] = temp;
            items++;
            for(int i = 0; i < edges.length; i++){
                if(edges[i][0] == temp && !exists(path, items, edges[i][1])){
                    queue.add(edges[i][1]);
                    if(edges[i][1] == destination){
                        d = true;
                    }
                }else if(edges[i][1] == temp && !exists(path, items, edges[i][0])){
                    queue.add(edges[i][0]);
                    if(edges[i][0] == destination){
                        d = true;
                    }
                }
            }
        }
        return d;
    }
    
    private boolean exists(int[] list, int size, int item) {
        boolean exists = false;
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                exists = true;
            }
        }
        return exists;
    }    
}
