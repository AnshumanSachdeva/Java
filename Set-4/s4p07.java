// 7. Sort a List in Ascending and Descending Order 
// Problem: 
// • Given a List<Integer>, sort it in both ascending and descending order. 
// Hint: Use Collections.sort() and Collections.reverseOrder(). 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class s4p07 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(2);

        Collections.sort(arr);
        System.out.println(arr);
        
        Collections.reverse(arr);
        System.out.println(arr);
    }
}