import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] arges) {
        String text = "кот пес кот мышь кот пес";
        String[] words = text.split(" ");

        Map<String, Integer> countMap = new HashMap<>();
        
        for (String w : words) {
            countMap.put(w, countMap.getOrDefault(w, 0) + 1);
        }

        System.out.println(countMap);
    }
}