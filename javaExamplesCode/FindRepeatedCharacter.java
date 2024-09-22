import java.util.HashSet;

public class FindRepeatedCharacter {
    public static void main(String[] args) {
        String word = "swiss";
        Character result = repeatedChar(word);

        if (result != null) {
            System.out.println("First repeated character: '" + result + "'");

        } else {
            System.out.println("No repeated character found.");
        }


    }

    public static Character repeatedChar(String word) {
        HashSet<Character> chars = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (chars.contains(ch)) {
                return ch;
            }
            chars.add(ch);
        }
        return null;
    }
}


