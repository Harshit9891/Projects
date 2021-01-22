package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
            public  static  void Number(int n ){
        int verify = n;
           int temp = n;
            int result = 0;
               while(temp != 0) {
                    n = temp %10;
                    result += Math.pow(n, 3);
                     temp = temp /10;
                }
   if(verify == result) {
        System.out.println("Armstrong NUmber is : " + result);
   }
   else{
    System.out.println("Given Number is not armstrong");
            }
}}
