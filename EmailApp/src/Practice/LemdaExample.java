package Practice;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LemdaExample {
    public static void chkLanguages(){
        ArrayList<String> langlist = new ArrayList<>();
        langlist.add("C");
        langlist.add("C++");
        langlist.add("JAVA");
        langlist.add("Python");
        langlist.add(".Net");
        langlist.add("Scalla");
        langlist.add("Go");
        langlist.add("C#");

        Predicate<String> endswitha = (n)->n.endsWith("a");
        Predicate<String> startsG = (n)->n.startsWith("G");
        Predicate<String> endswithva = (n)->n.endsWith("VA");
        Predicate<String> length3 = (n)->n.length()>3;

        langlist.stream().filter(endswitha).forEach(f-> System.out.println(f));
      //  langlist.stream().filter(startsG).forEach(g-> System.out.println(g));
       // langlist.stream().filter(endswithva).forEach(h-> System.out.println(h));
        //langlist.stream().filter(length3).forEach(j-> System.out.println(j));
    }
}
