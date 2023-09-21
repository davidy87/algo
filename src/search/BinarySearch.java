package search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static void search(int[] arr, int target) {
        System.out.println("---Binary Search---");

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int expected = indexOf(sorted, target);
        int actual = Arrays.binarySearch(sorted, target);

        if (expected == actual) {
            System.out.println("Binary search succeeded.");
        } else {
            System.out.println("Error");
            System.out.println("Expected: " + expected);
            System.out.println("Acutual: " + actual);
        }
    }

    private static int indexOf(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
