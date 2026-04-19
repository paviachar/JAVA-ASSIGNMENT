//Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList


package Basis;
import java.util.*;

public class p2 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println(ls);

        ls.remove(2);  // removes "pink"
        System.out.println(ls);

        ls.remove("Blue");  // removes "Blue"
        System.out.println(ls);
    }
}