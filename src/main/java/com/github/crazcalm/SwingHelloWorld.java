package com.github.crazcalm;
import javax.swing.*;

/**
 * Created by marcuswillock on 5/10/15.
 */
public class SwingHelloWorld extends JFrame {

    public static void main(String[] args){

        new SwingHelloWorld();
    }

    public SwingHelloWorld() {

        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello World SwingHelloWorld...");

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("This is a label");
        label1.setText("Text set in the label");

        JButton button1 = new JButton();
        button1.setText("Button says click me!");
        panel1.add(label1);
        panel1.add(button1);
        this.add(panel1);


        this.setVisible(true);

    }
}

