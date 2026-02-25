// 6. Reverse a List 
// Problem: 
// • Given a List<String>, reverse its elements. 
// Hint: Use Collections.reverse(). 

import java.util.*;

public class s4p06 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("Anshuman");
        arr.add("Jeevanjyot");
        arr.add("Saksham");
        arr.add("Swayam");
        arr.add("Knsihak");

        Collections.reverse(arr);
        System.out.println(arr);
    }
}