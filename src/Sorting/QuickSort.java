package Sorting;

import java.util.Arrays;

public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);

        System.out.println("---Quick Sort---");
        System.out.println("Before: " + Arrays.toString(this.arr));
        doSort(this.arr, 0, arr.length - 1);
        System.out.println("After: " + Arrays.toString(this.arr) + '\n');
    }

    private void doSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(arr, left, right);

        doSort(arr, left, pivot - 1);
        doSort(arr, pivot + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int l = left;
        int pivot = arr[right];

        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, l);
                l++;
            }
        }

        swap(arr, l, right);

        return l;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
