package Sorting;

import java.util.Arrays;

public class MergeSort {

    private int[] arr;

    public MergeSort(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);

        System.out.println("---Merge Sort---");
        System.out.println("Before: " + Arrays.toString(this.arr));
        mergeSort(this.arr, 0, arr.length - 1);
        System.out.println("After: " + Arrays.toString(this.arr) + '\n');
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] L = Arrays.copyOfRange(arr, left, mid + 1);
        int[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        int n1 = L.length, n2 = R.length;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }

            k++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
