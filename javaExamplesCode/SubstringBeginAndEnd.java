public class SubstringBeginAndEnd {

    public static void main(String[] args) {

        String str1 = "HelloHe";
        String str2 = "HelloHi";
        String str3 = "Hi";

        System.out.println("the subString  "+str1+" after the delete is:  " + without(str1));
        System.out.println("the subString "+str2+" after the delete is  :  " + without(str2));
        System.out.println("the subString " + str3+" after the delete is :  " + without(str3));

    }
    // in the start i read the first two charecter by using substring
    // in the end i read the the last two charecter in the string by using str.length() - 2
    // i compare if start is equal to the end if that is true delete the first two charecters that is same as the end charecters
    public static String without(String str) {

        String start = str.substring(0, 2);
        String end = str.substring(str.length() - 2);

        if (start.equals(end)) {
            return str.substring(2);
        }
    return str;
    }

}




