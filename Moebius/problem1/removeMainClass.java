package Moebius.problem1;
import java.util.*;

public class removeMainClass {
    public static void main(String[] args) {
        // Creating an instance of the Example class
        //Example example = new Example();
        Example2 example2 = new Example2();

        // Creating a list of integers
        List<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(11);
        dataList.add(4);
        dataList.add(12);

        // Calling the removeBigNumbers method
        //List<Integer> result = example.removeBigNumbers(dataList);
        List<Integer> result = example2.removeBigNumbers(dataList);

        // Printing the result
        System.out.println("Result after removing big numbers: " + result);
    }
}