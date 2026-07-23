package gcr_codebase.RecursionAndBacktracking;
import java.util.*;
public class FeatureFlag {
    static List<List<String>> result = new ArrayList<>();

    public static void backtrack(String[] arr, int index, List<String> current) {

        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(arr[index]);
        backtrack(arr, index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        backtrack(arr, index + 1, current);
    }

    public static List<List<String>> generateSubsets(String[] arr) {
        result.clear();
        backtrack(arr, 0, new ArrayList<>());
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of feature flags: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] flags = new String[n];

        System.out.println("Enter feature flag names:");

        for (int i = 0; i < n; i++)
            flags[i] = sc.nextLine();

        List<List<String>> ans = generateSubsets(flags);

        System.out.println("\nAll Possible Subsets:");

        for (List<String> subset : ans)
            System.out.println(subset);

        sc.close();
    }
}