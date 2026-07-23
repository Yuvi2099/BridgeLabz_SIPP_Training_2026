package gcr_codebase.RecursionAndBacktracking;
import java.util.*;
public class CombinationSum {

    static List<List<Integer>> result = new ArrayList<>();

    static void backtrack(int[] coins, int target, int start,int sum, List<Integer> current) {

        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < coins.length; i++) {

            if (sum + coins[i] > target)
                break;

            current.add(coins[i]);

            // Reuse same coin
            backtrack(coins, target, i,
                    sum + coins[i], current);

            current.remove(current.size() - 1);
        }
    }

    static List<List<Integer>> combinationSum(int[] coins, int target) {

        Arrays.sort(coins);

        result.clear();

        backtrack(coins, target, 0, 0,
                new ArrayList<>());

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coin denominations: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter denominations:");

        for (int i = 0; i < n; i++)
            coins[i] = sc.nextInt();

        System.out.print("Enter target amount: ");
        int target = sc.nextInt();

        List<List<Integer>> ans = combinationSum(coins, target);

        System.out.println("\nPossible Combinations:");

        for (List<Integer> list : ans)
            System.out.println(list);

        sc.close();
    }
}