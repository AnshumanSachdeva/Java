// 5. Find the Maximum and Minimum Elements in a List 
// Problem: 
// • Given a List<Integer>, find and print the maximum and minimum values. 
// Hint: Use Collections.max() and Collections.min(). 
import java.util.*;
public class s4p05 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(2);
        System.out.println("Maximum no. is: " + Collections.max(arr) + " Minimum no. is: " + Collections.min(arr));
    }
}
