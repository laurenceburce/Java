package Moebius.problem1;
import java.util.List;

public class Example {
    public List<Integer> removeBigNumbers(List<Integer> data) {
        //  A counter variable 'x' is used to iterate over the indices of 'data'
        for (int x = 0; x < data.size(); x++) {
            // Gets the value for the given index
            if (data.get(x) > 10) {
                // Modify the collection
                data.remove(x);
            }
        }
        return data;
    }
}
