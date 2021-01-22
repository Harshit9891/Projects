package Practice;

import java.util.Scanner;

public class breakExample {
    public static void breakCase(){
        int number, remainder;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=input.nextInt();
        remainder=number%10;
        switch (remainder){
            case 1:
                System.out.println("Uni");
                break;
            case 2:
                System.out.println("Duo");
                break;
            case 3:
                System.out.println("Tri");
                break;
            case 4:
                System.out.println("Quad");
                break;
            case 5:
                System.out.println("Penta");
                break;
            case 6:
                System.out.println("Hexa");
                break;
            case 7:
                System.out.println("Septi");
                break;
            case 8:
                System.out.println("octo");
                break;
            case 9:
                System.out.println("Nano");
                break;
            case 0:
                System.out.println("Deci");
                break;
        }
    }

}