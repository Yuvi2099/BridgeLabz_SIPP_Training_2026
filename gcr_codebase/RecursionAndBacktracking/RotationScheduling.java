package gcr_codebase.RecursionAndBacktracking;
import java.util.*;
public class RotationScheduling {

    static List<List<String>> result = new ArrayList<>();

    static void backtrack(String[] arr, boolean[] used, List<String> current) {

        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i])
                continue;

            used[i] = true;
            current.add(arr[i]);

            backtrack(arr, used, current);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    static List<List<String>> generatePermutations(String[] arr) {

        result.clear();
        boolean[] used = new boolean[arr.length];

        backtrack(arr, used, new ArrayList<>());

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of engineers: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] engineers = new String[n];

        System.out.println("Enter engineer names:");

        for (int i = 0; i < n; i++)
            engineers[i] = sc.nextLine();

        List<List<String>> ans = generatePermutations(engineers);

        System.out.println("\nAll Permutations:");

        for (List<String> list : ans)
            System.out.println(list);

        sc.close();
    }
}