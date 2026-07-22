package gcr_codebase.Hashing;
import java.util.*;
public class LongestConsecutiveUserID {
    public static int longestConsecutiveRun(int[] ids) {

        HashSet<Integer> set = new HashSet<>();

        for (int id : ids)
            set.add(id);

        int longest = 0;

        for (int id : set) {

            if (!set.contains(id - 1)) {

                int current = id;
                int length = 1;

                while (set.contains(current + 1)) {

                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ids = new int[n];

        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();

        System.out.println(longestConsecutiveRun(ids));
    }
}