package Two_Pointers_&_Sliding_Window;

import java.util.*;

public class PairSum_FraudDetection {

    public static int[] findPairSum(int[] transactions, int target) {

        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {

            int sum = transactions[left] + transactions[right];

            if (sum == target)
                return new int[]{transactions[left], transactions[right]};

            if (sum < target)
                left++;
            else
                right--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] transactions = new int[n];

        for (int i = 0; i < n; i++)
            transactions[i] = sc.nextInt();

        int target = sc.nextInt();

        int[] ans = findPairSum(transactions, target);

        System.out.println(Arrays.toString(ans));
    }
}