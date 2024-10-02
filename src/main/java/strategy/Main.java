package strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortContext sortHandler = new SortContext(new QuickSortStrategy());

        // Test arrays
        int[] smallArr = new int[30];
        int[] largeArr = new int[100000];

        for (int i = 0; i < smallArr.length; i++) {
            smallArr[i] = (int) (Math.random() * 100); // Filling with random numbers
        }

        for (int i = 0; i < largeArr.length; i++) {
            largeArr[i] = (int) (Math.random() * 100000); // Filling with random numbers
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("Choose which sorting algorithm you want to use: ");
            System.out.println("1. Quick sort");
            System.out.println("2. Selection sort");
            System.out.println("3. Merge sort");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sortHandler.setSortingStrategy(new QuickSortStrategy());
                    break;
                case 2:
                    sortHandler.setSortingStrategy(new SelectionSortStrategy());
                    break;
                case 3:
                    sortHandler.setSortingStrategy(new MergeSortStrategy());
                    break;
                case 4:
                    exit = true;
                    continue; // Exit the loop
                default:
                    System.out.println("Invalid choice!");
                    continue; // Continue to next iteration
            }

            // Measure time for small array in milliseconds
            long startTime = System.nanoTime();
            sortHandler.sort(smallArr.clone()); // Clone to preserve the original array
            long endTime = System.nanoTime();
            System.out.println("Time taken to sort small array: " + (endTime - startTime) + " ms");

            // Measure time for large array in milliseconds
            startTime = System.nanoTime();
            sortHandler.sort(largeArr.clone()); // Clone to preserve the original array
            endTime = System.nanoTime();
            System.out.println("Time taken to sort large array: " + (endTime - startTime) + " ms");

            System.out.println();
        }
    }
}
