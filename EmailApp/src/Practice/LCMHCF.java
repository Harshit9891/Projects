package Practice;

import java.util.Scanner;

public class LCMHCF {
        public static void main(String[] args){
            int a,b;
            int numerator,denominator,remainder,lcm,hcf;
            System.out.println("Enter two numbers:");
            Scanner scan = new Scanner(System.in);
            System.out.println(" a = ");
            a=scan.nextInt();
            System.out.println(" b = ");
            b=scan.nextInt();
            if (a>b)
            {
                numerator = a;
                denominator = b;
            }
            else
            {
                numerator=b;
                denominator=a;
            }
            remainder=numerator%denominator;
            while(remainder!=0)
            {
                numerator=denominator;
                denominator=remainder;
                remainder=numerator%denominator;
            }
            hcf=denominator;
            lcm=a*b/hcf;
            System.out.println("HCF of " + a + " and " + b + " is : " + hcf);
            System.out.println("LCM of "+ a + " and " + b +" is : " +lcm);
        }

}
