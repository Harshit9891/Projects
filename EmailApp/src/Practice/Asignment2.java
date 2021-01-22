package Practice;

import java.util.Scanner;

public class Asignment2 {
    public static void main(String[] args){
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to swap:");
        a=scan.nextInt();
        b=scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Result after swapping:" + " a = " + a + " b = " +b);
    }

}
