public class FrequentCharacter {
    public static void main(String[] args) {
        String word = "success";
        char result = mostFrequentChar(word);
        System.out.println("Most frequent character: '" + result + "'");
    }
    // first i do empty array for 26 charrecters
    // for loop iterates for each charecters in the string
    // [ch - 'a'] caculates each index for charecters like b - a =1
    // count of the charecter is increment by one
    // mostFrequent is just starting point
    // maxCount :assemption that the first charecter is the most frequent

    public static char mostFrequentChar(String str) {
        int[] charCount = new int[26];// Array to track 26 charecters

        // count occurrences  for each charecter
        for (char ch : str.toCharArray()) { // any charecter in charecters array
            charCount[ch - 'a']++;// increment count for the charecter starting from index 0 for [a] charecter
        }

        char mostFrequent = str.charAt(0); // set the most frequent charecter is index 0 which is a
        int maxCount = charCount[mostFrequent - 'a'];// Initialize with the first character's count

        //this loop goes through each index from 0 to 25
        // it updates maxCount to that new count and updates mostFrequent to the character
        // return it back the index into charecter
        
        for (int i = 0; i < charCount.length; i++) { // in this loop we look charecter by charecter in the array
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequent = (char) (i + 'a');// Convert index back to character
            }
        }

        return mostFrequent;
    }
}