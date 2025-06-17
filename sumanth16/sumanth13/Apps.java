import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Apps{
    public static void main(String[] args) {
        Graph graph = new Graph(5, false);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);

        graph.printGraph();
        graph.dfs(0, new boolean[5]);
        System.out.println();
        graph.bfs();
    }
}

class Graph {
    ArrayList<HashSet<Integer>> graph;
    int vertices;
    boolean isDirected;

    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new HashSet<>());
        }
    }

    public void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).add(dest);
            if (!isDirected)
                graph.get(dest).add(src);
        } else {
            System.out.println("Invalid source and destination. Available vertices are:");
            for (int i = 0; i < this.vertices; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).remove(dest);
            if (!isDirected)
                graph.get(dest).remove(src);
        } else {
            System.out.println("Invalid source and destination. Available vertices are:");
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    boolean isHavingEdge(int src, int dest) {
        return graph.get(src).contains(dest);
    }

    HashSet<Integer> getNeighbours(int src) throws IndexOutOfBoundsException {
        if (src >= 0 && src < vertices)
            return graph.get(src);
        throw new IndexOutOfBoundsException("Invalid source index");
    }

    boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    void printGraph() {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + ": ");
            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int neighbor : getNeighbours(start)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        q.add(0);

        while (!q.isEmpty()) {
            int current = q.remove();
            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");
                for (int neighbor : getNeighbours(current)) {
                    q.add(neighbor);
                }
            }
        }
    }
}
