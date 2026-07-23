package gcr_codebase.Graphs;
import java.util.*;

public class GraphRepresentation {

    static Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    // Add friendship
    public static void addFriendship(int u, int v) {
        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    // Check friendship
    public static boolean isFriend(int u, int v) {
        return friendGraph.getOrDefault(u, Collections.emptySet()).contains(v);
    }

    // Print graph
    public static void printGraph() {
        for (int user : friendGraph.keySet()) {
            System.out.println(user + " -> " + friendGraph.get(user));
        }
    }

    public static void main(String[] args) {

        addFriendship(1, 2);
        addFriendship(1, 3);
        addFriendship(2, 4);
        addFriendship(3, 5);

        System.out.println("Friend Graph:");
        printGraph();

        System.out.println("\nIs 1 friend with 2? " + isFriend(1, 2));
        System.out.println("Is 2 friend with 5? " + isFriend(2, 5));
    }
}