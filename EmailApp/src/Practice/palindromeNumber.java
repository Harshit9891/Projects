package Practice;

import java.util.Scanner;

public class palindromeNumber {
        public static void palindrome(){
            int n,r,temp,sum=0;
            Scanner input= new Scanner(System.in);
            System.out.println("Please enter the number");
            n=input.nextInt();
            temp=n;
            while (n!=0){
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if (temp==sum)
                System.out.println("The given number is palindrome number");
            else
                System.out.println("it is not a palindrome number, try another number");

        }

}
