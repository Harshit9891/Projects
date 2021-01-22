package Practice;

import java.util.Scanner;

public class numberVowels {
    public static void vowels(){
        int count = 0;
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int i;
        for (i=0 ; i<sentence.length() ; i++){
            char ch = sentence.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("total number of vowels are " +count);


    }
}
