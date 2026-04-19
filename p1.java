//Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not


package Basis;
import java.util.*;

public class p1 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");  // corrected
        ls.add("pink");
        ls.add("red");

        System.out.println(ls);

        if (ls.contains("red")) {
            System.out.println("available");
        } else {
            System.out.println("not available");
        }
    }
}