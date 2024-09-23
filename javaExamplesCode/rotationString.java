public class rotationString {
    public static void main(String[] args){
        String firstWord = "abcd";
        String secondWord= "dabc";

        boolean result = rotation(firstWord,secondWord);
        System.out.println("the two string are Rotation?  "+result);


    }
    public static boolean rotation(String firstword,String secondWord){
        if (firstword.length()!= secondWord.length()){
            return false;
        }
        String fullWord = firstword+secondWord;

        return fullWord.contains(secondWord);
    }
}
