package com.github.crazcalm.SwingChapter2;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by marcuswillock on 5/10/15.
 */
public class ClickMe
        extends JFrame implements ActionListener
{
    public static void main(String[] args){

        new ClickMe();
    }

    private JButton button1;

    public ClickMe(){

        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("<< I am Listening >>");

        JPanel panel1 = new JPanel();
        button1 = new JButton("<< Click Me >>");
        button1.addActionListener(this);
        panel1.add(button1);
        this.add(panel1);

        this.setVisible(true);
    }

    private int clickCount = 0;

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == button1){

            clickCount++;
            if(clickCount % 2 == 0){

                button1.setText("I have been clicked an even amount of times");
            }
            else{

                button1.setText("I've been clicked " + clickCount + " times.");
            }
        }
    }
}
