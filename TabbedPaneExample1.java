
//Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan

package Swings;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

public class TabbedPaneExample1 {

    JFrame f;

    TabbedPaneExample1() {
        f = new JFrame("Tabbed Pane Example");

        // Panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Tabbed Pane
        JTabbedPane tp = new JTabbedPane();

        tp.add("Cyan", p1);
        tp.add("Magenta", p2);
        tp.add("Yellow", p3);

        // Event Handling
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String color = tp.getTitleAt(index);
                System.out.println("Selected Color: " + color);
            }
        });

        // Add to frame
        f.add(tp);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample1();
    }
}