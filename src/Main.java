import sorting.*;


public class Main {
    private static final int[] arr = {5, 3, 6, 7, 1, 3, 5};

    public static void main(String[] args) {
        SortingAlgos sortingAlgo = new SortingAlgos();
//        sortingAlgo.bubbleSort(arr);
//        sortingAlgo.selectionSort(arr);

        QuickSort quickSort = new QuickSort(arr);
        MergeSort mergeSort = new MergeSort(arr);

        HeapSort.doSort(arr);
        CountingSort.doSort(arr);
        RadixSort.doSort(arr);
    }

}