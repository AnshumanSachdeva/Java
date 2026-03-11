import java.util.HashMap;

public class Sentence {
    String sent = "";

    Sentence(String s) {
        sent = s;
    }

    void split() {
        String[] words = sent.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words) {

            if (map.containsKey(w))
                map.put(w, map.get(w) + 1);
            else
                map.put(w, 1);
        }
        
            System.out.println(map);
    }
    public static void main(String[] args) {
        Sentence s = new Sentence("java is useful java is powerfull");
        s.split();
    }
}
