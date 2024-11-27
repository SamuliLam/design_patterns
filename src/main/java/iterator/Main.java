package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer numbersToBeGenerated = 10;
        ISequence sequence = new FibonacciSequence(numbersToBeGenerated);
        Iterator<Integer> iterator = sequence.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
