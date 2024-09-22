public class CountOccurrencesOfSubstring {
    public static void main(String[] args){

        String word = "banana";
        String subword = "ana";
        int count = countOccurr(word,subword);
        System.out.println("Occurrences of \"" + subword + "\": " + count);
    }
    public static int countOccurr(String word, String subword){
        int count = 0;
        int index = 0;

        while ((index=word.indexOf(subword,index))!=-1){
            count++;
            index=index+subword.length();


        }
        return count;
    }
}



