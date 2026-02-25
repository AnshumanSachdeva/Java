// 8. Count the Frequency of Elements in a List 
// Problem: 
// • Given a List<String>, count how many times each string appears. 
// List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", 
// "apple"); 
// System.out.println(countFrequencies(words));   
// // Output: {apple=3, banana=2, orange=1} 
// Hint: Use a HashMap<String, Integer>. 

import java.util.*;

public class s4p08 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("apple");
        
        HashMap<String, Integer> hm = new HashMap<String,Integer>();
        for (String string : words) {
            hm.put(string, hm.getOrDefault(string, 0) + 1);
        }
        System.out.println(hm);
    }
}
