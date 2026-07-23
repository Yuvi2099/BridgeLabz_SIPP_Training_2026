package gcr_codebase.Heap;

public class BuildHeap{

    public static void buildHeap(int[] arr) {
        int n = arr.length;

        // Start from last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(arr, i, n);
        }
    }

    public static void siftDown(int[] arr, int i, int size) {

        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            siftDown(arr, smallest, size);
        }
    }

    public static void printHeap(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] priorities = {40, 10, 30, 50, 60, 15, 20};

        System.out.println("Before Heapify:");
        printHeap(priorities);

        buildHeap(priorities);

        System.out.println("After Min Heap:");
        printHeap(priorities);
    }
}