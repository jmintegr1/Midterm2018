package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String plstr = "DAD";


        String reverseStr = ""; // Objects of String class

        int length = plstr.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverseStr = reverseStr + plstr.charAt(i);

        if (plstr.equals(reverseStr))
            System.out.println(plstr + " is a palindrome.. Congrats!");
        else
            System.out.println(plstr + " is not a palindrome.. Try again!");

    }
}

