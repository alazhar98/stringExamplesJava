import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = in.nextLine();
        System.out.println("Enter Second string: ");
        String str2 = in.nextLine();

        System.out.println("String Concatenation of "+str1+"  And  "+str2+"  is: "+concatenation(str1,str2));


    }
    // i find the length of the first and second string
    // i use math to find the minumum value of length between the two string
    //i use the substring to delete the more charecters by minus from the minimumLength
    
    public static String concatenation(String str1,String str2){
        int lenStr1= str1.length();
        int lenStr2= str2.length();

        int minimumLength = Math.min(lenStr1,lenStr2);

        String subStr1 = str1.substring(lenStr1-minimumLength);
        String subStr2 = str2.substring(lenStr2-minimumLength);

        return subStr1+subStr2;



        }
    }

