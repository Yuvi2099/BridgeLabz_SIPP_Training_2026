package Two_Pointers_&_Sliding_Window;
import java.util.*;
public class Triplets_LoadBalancing {

    public static List<List<Integer>> findTriplets(int[] jobs, int target) {

        Arrays.sort(jobs);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < jobs.length - 2; i++) {

            if (i > 0 && jobs[i] == jobs[i - 1])
                continue;

            int left = i + 1;
            int right = jobs.length - 1;

            while (left < right) {

                int sum = jobs[i] + jobs[left] + jobs[right];

                if (sum == target) {

                    result.add(Arrays.asList(jobs[i], jobs[left], jobs[right]));

                    while (left < right && jobs[left] == jobs[left + 1])
                        left++;

                    while (left < right && jobs[right] == jobs[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] jobs = new int[n];

        for (int i = 0; i < n; i++)
            jobs[i] = sc.nextInt();

        int target = sc.nextInt();

        List<List<Integer>> ans = findTriplets(jobs, target);

        for (List<Integer> triplet : ans)
            System.out.println(triplet);
    }
}