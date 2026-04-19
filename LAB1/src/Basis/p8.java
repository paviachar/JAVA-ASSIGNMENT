//Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))



package Basis;
import java.util.*;

public class p8 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("green");   // corrected spelling
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println(ls);

        ls.addLast("pink");   // adds element at the end

        System.out.println(ls);
    }
}