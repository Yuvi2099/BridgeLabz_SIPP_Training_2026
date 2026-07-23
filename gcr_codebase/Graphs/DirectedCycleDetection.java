package gcr_codebase.Graphs;
import java.util.*;

public class DirectedCycleDetection {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add Directed Edge
    public static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    // DFS using 3-state coloring
    public static boolean dfsCycle(int node, int[] state) {

        state[node] = 1; // GRAY (currently visiting)

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            // Found a back edge
            if (state[neighbor] == 1)
                return true;

            // Visit unvisited node
            if (state[neighbor] == 0 && dfsCycle(neighbor, state))
                return true;
        }

        state[node] = 2; // BLACK (completely processed)

        return false;
    }

    // Check if graph contains cycle
    public static boolean hasCycle(int n) {

        int[] state = new int[n];
        // 0 = WHITE, 1 = GRAY, 2 = BLACK

        for (int i = 0; i < n; i++) {

            if (state[i] == 0) {

                if (dfsCycle(i, state))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 1);   // Creates a directed cycle

        int n = 4;

        if (hasCycle(n)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}