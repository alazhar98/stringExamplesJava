public class FrequentCharacter {
    public static void main(String[] args) {
        String word = "success";
        char result = mostFrequentChar(word);
        System.out.println("Most frequent character: '" + result + "'");
    }

    public static char mostFrequentChar(String str) {
        int[] charCount = new int[26];


        for (char ch : str.toCharArray()) {
            charCount[ch - 'a']++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = charCount[mostFrequent - 'a'];

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequent = (char) (i + 'a');
            }
        }

        return mostFrequent;
    }
}