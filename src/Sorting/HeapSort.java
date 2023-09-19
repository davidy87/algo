package Sorting;


import java.util.Arrays;

public class HeapSort {

    public static void doSort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);
        System.out.println("---Heap Sort---");
        System.out.println("Before: " + Arrays.toString(arr));
        int n = arr.length;

        // Max Heap 초기화
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }

    private static void heapify(int[] arr, int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // Left child node
        if (l < n && arr[p] < arr[l]) {
            p = l;
        }

        // Right child node
        if (r < n && arr[p] < arr[r]) {
            p = r;
        }

        if (i != p) {
            swap(arr, p, i);
            heapify(arr, n, p);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
