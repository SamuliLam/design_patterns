package strategy;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];

    }

    private void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitioningIndex = partition(arr, low, high);
            quickSort(arr, partitioningIndex + 1, high);
        }
    }

    private int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int k = high;

        for (int i = high; i > low; i--) {
            if (arr[i] > pivot) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        int temp = arr[k];
        arr[k] = arr[low];
        arr[low] = temp;
        return k;
    }
}
