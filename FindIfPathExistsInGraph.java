import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] path = new boolean[n];
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean d = (source == destination);
        queue.add(source);
        while(!queue.isEmpty() && !d){
            int temp = queue.remove();
            path[temp] = true;
            for(int i = 0; i < edges.length && !d; i++){
                if(edges[i][0] == temp && !path[edges[i][1]]){
                    queue.add(edges[i][1]);
                    if(edges[i][1] == destination){
                        d = true;
                    }
                }else if(edges[i][1] == temp && !path[edges[i][0]]){
                    queue.add(edges[i][0]);
                    if(edges[i][0] == destination){
                        d = true;
                    }
                }
            }
        }
        return d;
    }
}
