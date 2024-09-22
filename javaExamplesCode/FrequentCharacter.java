import java.util.HashMap;
import java.util.Map;

public class FrequentCharacter {
    public static void main(String[] args){
        String word = "success";
        char result = mostFrequentChar(word);
        System.out.println("Most frequent character: '" + result + "'");
    }
    public static char mostFrequentChar(String str) {

        Map<Character, Integer> charCount = new HashMap<>();


        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        
        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}
