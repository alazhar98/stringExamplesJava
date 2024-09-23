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

        boolean[] seen = new boolean[26]; // Array to track characters with number of charecters

        for (char ch : word.toCharArray()) {
            int index = ch - 'a'; // Calculate index [index of letter a is 0 and so on ]
            // If the character has seen, return it
            if (seen[index]) {
                return ch;
            }
            // Mark this character as seen
            seen[index] = true;
        }

        // If no character is repeated return null
        return null;
    }
}
