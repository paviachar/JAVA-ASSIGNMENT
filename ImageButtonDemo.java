// Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).


package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener {

    JButton btnClock, btnHourGlass;
    JLabel messageLabel;

    public ImageButtonDemo() {
        setTitle("Button Image Example");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        btnClock = new JButton(clockIcon);
        btnHourGlass = new JButton(hourGlassIcon);

        // Label to display message
        messageLabel = new JLabel("Click a button");

        // Add ActionListener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components to frame
        add(btnClock);
        add(btnHourGlass);
        add(messageLabel);

        setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}