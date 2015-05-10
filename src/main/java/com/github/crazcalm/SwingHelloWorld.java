package com.github.crazcalm;
import javax.swing.*;

/**
 * Created by marcuswillock on 5/10/15.
 */
public class SwingHelloWorld extends JFrame {

    public static void main(String[] args){

        new SwingHelloWorld();
    }

    public SwingHelloWorld(){

        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello World");
        this.setVisible(true);

    }
}
