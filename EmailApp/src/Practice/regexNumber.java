package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexNumber {
    public static void phoneNumber(String number){
        String phoneNumber = "^\\d{3}-\\d{3}-\\d{4}$";
        Pattern pt = Pattern.compile(phoneNumber);
        if (pt.matcher(number).matches())
        {
            System.out.println("Valid number");

        }
        else {
            System.out.println("Please enter valid number");
        }
    }
}
