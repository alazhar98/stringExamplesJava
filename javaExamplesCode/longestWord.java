public class longestWord {
    public static void main(String[] args){

        String sentence = "The quick brown fox jumped over the lazy dog";
        String longest = longestWord(sentence);

        System.out.println("Longest word: " + longest);
    }
    public static String longestWord(String sentence){
        String[] worsds = sentence.split(" ");
        String longest = "";

        for(String word:worsds){
            if(word.length()>longest.length()){
                longest=word;

            }

        }
        return longest;
    }
}
