package sorting;

import java.util.Arrays;

public class RadixSort {

    public static void doSort(int[] arr) {
        System.out.println("---Radix Sort---");
        System.out.println("Before: " + Arrays.toString(arr));

        arr = Arrays.copyOf(arr, arr.length);
        radixSort(arr, arr.length);

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }

    private static void radixSort(int[] arr, int n) {
        int max = getMax(arr, n);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    private static void countSort(int arr[], int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private static int getMax(int[] arr, int n) {
        return Arrays.stream(Arrays.copyOfRange(arr, 0, n))
                .max()
                .getAsInt();
    }
}
