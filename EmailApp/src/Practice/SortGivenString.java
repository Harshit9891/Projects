package Practice;
import java.util.Arrays;

public class SortGivenString {
    public static void sortString(String word) {
        char[] startsort = word.toCharArray();
        Arrays.sort(startsort);

        System.out.println(new String(startsort));


    }
}