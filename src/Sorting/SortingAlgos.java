package Sorting;

import java.util.Arrays;

public class SortingAlgos {

    public void bubbleSort(int[] arr) {
        System.out.println("---Bubble Sort---");
        System.out.println("Before: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }

    public void selectionSort(int[] arr) {
        System.out.println("---Selection Sort---");
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }

}
