import java.util.Scanner;

public class copiesOfFirstChar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string :");
        String extra = in.nextLine();
        System.out.println(copies(extra));
    }
    /*
    First i set First two Charecters as String
    Then, I check if String that user input it is greater than or equal to 2
    if it is greater than or equal to 2 then i make substring for first two letter and give it to first two viriable
    else if it is less than 2 then reteun String that user input it
    then i add first two 3 times 
     */
    public static String copies(String str){
        String firstTwo;
        if (str.length()>=2){
             firstTwo = str.substring(0,2);
        }
        else {
            firstTwo=str;
        }
        return firstTwo+firstTwo+firstTwo;
    }
}
