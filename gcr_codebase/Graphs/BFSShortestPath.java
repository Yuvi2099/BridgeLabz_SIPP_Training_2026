package gcr_codebase.Graphs;

import java.util.*;

public class BFSShortestPath {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add edge
    public static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // BFS Shortest Path
    public static List<Integer> shortestPath(int source, int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination)
                break;

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }

        if (!visited.contains(destination))
            return Collections.emptyList();

        LinkedList<Integer> path = new LinkedList<>();
        Integer node = destination;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(3, 5);
        addEdge(4, 6);
        addEdge(5, 6);

        List<Integer> path = shortestPath(1, 6);

        System.out.println("Shortest Path:");
        System.out.println(path);
    }
}