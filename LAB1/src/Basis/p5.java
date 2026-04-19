//Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index



package Basis;
import java.util.*;

public class p5 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        String Str = "green";

        System.out.println(ls);

        System.out.println("Removing the element: " + ls.remove(Str));

        System.out.println(ls);
    }
}