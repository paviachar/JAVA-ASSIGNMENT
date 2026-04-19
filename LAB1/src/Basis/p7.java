//Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())


package Basis;
import java.util.*;

public class p7 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("green");   // corrected spelling
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Method 1: Using descendingIterator()
        Iterator<String> iterator = ls.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}