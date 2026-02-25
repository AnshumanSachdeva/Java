// 4. Convert an Array to a List and Vice Versa 
// Problem: 
// • Convert an Integer[] array into a List<Integer> and back to an array. 
// Hint: Use Arrays.asList() and toArray().

import java.util.*;
public class s4p4 {
    public static void main(String[] args) {
        Integer arr1[] = {2, 3, 4, 5, 6};
        List <Integer> list1 = Arrays.asList(arr1);
        System.out.println(list1);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer [] arr; 
        arr = list.toArray(new Integer [0]);
        System.out.println(arr[0]);
        System.out.println(arr[1]);


    }
}
