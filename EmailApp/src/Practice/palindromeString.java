package Practice;

import java.util.Scanner;

public class palindromeString {
    public static void stringReverse(){
        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String orignalString = input.nextLine();
        String reverseString = new StringBuilder(orignalString).reverse().toString();
        if (orignalString.equals(reverseString)) {
            System.out.println("It is Palindrome String. ");
        }
        else
        {
            System.out.println("It is not Palindrome String");
        }
    }
}

