package gcr_codebase.Sorting_Algorithms;
import java.util.*;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        insertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}