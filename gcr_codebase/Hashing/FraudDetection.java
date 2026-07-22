package gcr_codebase.Hashing;
import java.util.*;
public class FraudDetection {
    public static int[] findFraudPair(int[] amounts, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};

            map.put(amounts[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] amounts = new int[n];

        for (int i = 0; i < n; i++)
            amounts[i] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println(Arrays.toString(findFraudPair(amounts, target)));
    }
}