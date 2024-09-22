public class RemoveCharacter {
    public static void main(String[] args){
        String sentence ="Hello World";
        char ch = 'l';
        String result = removeCh(sentence,ch);
        System.out.println("Result after removing '" + ch + "': " + result);


    }
    public static String removeCh(String sentence, char ch){

        StringBuilder result = new StringBuilder();

        for (char currentCh: sentence.toCharArray()){
            if(currentCh!=ch){
                result.append(currentCh);
            }

        }
        return result.toString();
    }
}
