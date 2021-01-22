package Practice;

import java.util.Scanner;

public class reverseNumbers{

        public static void reverseNumbers(){
            int rev=0,n;
            System.out.println("Enter the number:");
            Scanner input = new Scanner(System.in);
            n=input.nextInt();
            while(n!=0)
            {
                rev=rev*10;
                rev=rev+n%10;
                n=n/10;
            }
            System.out.println(" the reverse of the number is: " + rev);
        }

}