package gcr_codebase.Graphs;
import java.util.*;

public class DSFALLPaths {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add Edge
    public static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // Find all paths
    public static void allPaths(int current, int target,
                                List<Integer> path,
                                Set<Integer> visited,
                                List<List<Integer>> result) {

        path.add(current);
        visited.add(current);

        if (current == target) {
            result.add(new ArrayList<>(path));
        } else {

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {
                    allPaths(neighbor, target, path, visited, result);
                }
            }
        }

        // Backtracking
        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(3, 4);
        addEdge(2, 5);
        addEdge(5, 4);

        List<List<Integer>> result = new ArrayList<>();

        allPaths(1, 4,
                new ArrayList<>(),
                new HashSet<>(),
                result);

        System.out.println("All Possible Paths:");

        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}