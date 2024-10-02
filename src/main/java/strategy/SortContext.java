package strategy;

public class SortContext {
    private SortingStrategy sortingStrategy;

    public SortContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] arr) {
        sortingStrategy.sort(arr);
    }
}
