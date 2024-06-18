package Moebius.problem1;
import java.util.List;
// Import the Iterator class
import java.util.Iterator;

public class Example2 {
    public List<Integer> removeBigNumbers(List<Integer> data) {
        // Initialize the iterator variable with the collection 'data'
        Iterator<Integer> iterator = data.iterator();
        // While loop to verify if there are more elements to iterate over
        while (iterator.hasNext()) {
            // Obtain the next element
            Integer i = iterator.next();
            // Check if it is greater than 10
            if (i > 10) {
                // Remove if it is
                iterator.remove();
            }
        }
        return data;
    }
}
