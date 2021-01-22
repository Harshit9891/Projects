package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDate {
    public static void dateChk(String date){
       String dateRegex =  "^\\d{2}[- ]?\\d{2}[- ]?\\d{4}$";

        Pattern pt = Pattern.compile(dateRegex);
        if(pt.matcher(date).matches())
        {
            System.out.println("Valid Date"+ date);
        }
        else{
            System.out.println("Please enter valid date");
        }



    }


}
