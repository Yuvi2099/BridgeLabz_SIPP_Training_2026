package gcr_codebase.Hashing;
import java.util.*;
public class SubArraySum {
    public static int subarraySumEqualsK(int[] nums, int k) {

        HashMap<Integer, Integer> prefixCount = new HashMap<>();

        prefixCount.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int num : nums) {

            sum += num;

            answer += prefixCount.getOrDefault(sum - k, 0);

            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(subarraySumEqualsK(nums, k));
    }
}