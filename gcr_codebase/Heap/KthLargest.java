package gcr_codebase.Heap;
import java.util.PriorityQueue;
public class KthLargest {

    public static int findKthLargest(int[] scores, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {

            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] scores = {55, 72, 90, 81, 65, 99, 78, 88};
        int k = 3;

        int ans = findKthLargest(scores, k);

        System.out.println(k + "rd Largest Element = " + ans);
    }
}