package strategy;

public class QuickSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        quickSort(arr, 0, n - 1);
    }

    // quicksort using first element as pivot, low : first element, high : last element
    private void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex -1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private int partition(int arr[], int low, int high) {

        int pivot = arr[low];
        int k = high;

        for (int i = high; i > low; i--) {
            if (arr[i] > pivot) {
                // swap elements
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        // swap elements
        int temp = arr[k];
        arr[k] = arr[low];
        arr[low] = temp;
        return k;
    }
}
