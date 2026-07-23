package gcr_codebase.Heap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargest {

    public static List<Integer> topKLargest(int[] arr, int k) {

        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        List<Integer> result = new ArrayList<>(minHeap);

        // Optional: Sort in descending order
        Collections.sort(result, Collections.reverseOrder());

        return result;
    }

    public static void main(String[] args) {

        int[] transactions = {15, 40, 10, 80, 25, 90, 50, 60};
        int k = 3;

        List<Integer> ans = topKLargest(transactions, k);

        System.out.println("Top " + k + " Largest Elements:");
        System.out.println(ans);
    }
}