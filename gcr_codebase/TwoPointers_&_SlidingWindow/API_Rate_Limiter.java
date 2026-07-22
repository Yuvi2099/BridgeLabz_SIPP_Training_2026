package Two_Pointers_&_Sliding_Window;
import java.util.*;
public class API_Rate_Limiter {
    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> freq = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < keyIds.length; end++) {

            freq.put(keyIds[end], freq.getOrDefault(keyIds[end], 0) + 1);

            while (freq.size() > n) {

                int leftKey = keyIds[start];

                freq.put(leftKey, freq.get(leftKey) - 1);

                if (freq.get(leftKey) == 0)
                    freq.remove(leftKey);

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] keyIds = new int[size];

        for (int i = 0; i < size; i++)
            keyIds[i] = sc.nextInt();

        int n = sc.nextInt();

        System.out.println(longestSubarrayWithAtMostNDistinct(keyIds, n));
    }
}