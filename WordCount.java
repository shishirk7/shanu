import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = "This is a test. This test is simple.";
        
        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        
        // Split the string into words
        String[] words = text.split("\\s+");
        
        // Create a HashMap to store word frequency
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        // Display the word count
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
