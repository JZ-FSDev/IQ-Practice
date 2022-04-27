import java.util.LinkedList;
import java.util.Queue;

/**
 * Self-written solution of "Find if Path Exists in Graph" from LeetCode.
 * Faster than 88.45% of Java online submissions.
 * Less than 99.78% of Java online submissions.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class FindIfPathExistsInGraph {

    /**
     * There is a bi-directional graph with n vertices, where each vertex is labeled
     * from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D
     * integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional
     * edge between vertex ui and vertex vi. Every vertex pair is connected by at
     * most one edge, and no vertex has an edge to itself.
     * 
     * You want to determine if there is a valid path that exists from vertex source
     * to vertex destination.
     * 
     * Given edges and the integers n, source, and destination, return true if there
     * is a valid path from source to destination, or false otherwise.
     * 
     * @param n Number of vertices.
     * @param edges Array of edges described as an array of vertex-pairs.
     * @param source The source vertex.
     * @param destination The destination vertex.
     * @return True if there exists a path between the source and destination vertex.
     */
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] path = new boolean[n];
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean d = (source == destination);
        queue.add(source);
        while (!queue.isEmpty() && !d) {
            int temp = queue.remove();
            path[temp] = true;
            for (int i = 0; i < edges.length && !d; i++) {
                if (edges[i][0] == temp && !path[edges[i][1]]) {
                    queue.add(edges[i][1]);
                    if (edges[i][1] == destination) {
                        d = true;
                    }
                } else if (edges[i][1] == temp && !path[edges[i][0]]) {
                    queue.add(edges[i][0]);
                    if (edges[i][0] == destination) {
                        d = true;
                    }
                }
            }
        }
        return d;
    }
}
