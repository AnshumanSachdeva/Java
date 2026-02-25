// 1. Add and Retrieve Elements from an ArrayList 
// Problem: 
// • Create an ArrayList<String>, add five names to it, and print each name using a 
// loop. 
// Hint: Use add() and get() methods of ArrayList.
import java.util.ArrayList;

public class s4p1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Anshuman");
        arr.add("Swayam");
        arr.add("Knsihak");
        arr.add("Jeevanjyot");
        arr.add("Saksham");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}
