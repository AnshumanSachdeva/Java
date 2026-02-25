// 3. Check if a List Contains a Specific Element 
// Problem: 
// • Given a List<String>, check if a specific string is present. 
// Hint: Use the contains() method of List. 
import java.util.ArrayList;
import java.util.Scanner;
public class s4p3 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        x = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.contains(x));
    
        sc.close();
    }   
}