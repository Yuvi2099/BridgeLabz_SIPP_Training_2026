package Sorting_Algorithms;
import java.util.*;

public class BubbleSort_SwapCount {

    public static int bubbleSort(int[] arr) {

        int swaps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        return swaps;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int swapCount = bubbleSort(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
        System.out.println("Total Swaps: " + swapCount);
    }
}