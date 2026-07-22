package Two_Pointers_&_Sliding_Window;
import java.util.*;
public class FixedWindow_ServerCPU {
    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cpu = new int[n];

        for (int i = 0; i < n; i++)
            cpu[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(maxSubarrayOfSizeK(cpu, k));
    }
}