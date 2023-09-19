package Sorting;

import java.util.Arrays;

public class CountingSort {

    public static void doSort(int[] arr) {
        System.out.println("---Counting Sort---");
        System.out.println("Before: " + Arrays.toString(arr));

        int maxVal = Arrays.stream(arr).max().getAsInt();
        int[] result = countingSort(arr, maxVal);

        System.out.println("After: " + Arrays.toString(result));
    }

    private static int[] countingSort(int[] arr, int n) {
        int[] result = new int[arr.length];
        int[] counter = new int[n + 1];

        // 1. Count elements in arr
        for (int i : arr) {
            counter[i]++;
        }

        // 2. Modify counter by adding previous count
        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        for (int i = arr.length - 1; i >=0; i--) {
            counter[arr[i]]--;
            result[counter[arr[i]]] = arr[i];
        }

        return result;
    }
}
