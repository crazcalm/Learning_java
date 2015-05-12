package com.github.crazcalm.SwingChapter2;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by marcuswillock on 5/11/15.
 */
public class ClickMe2 extends JFrame {

    public static void main(String[] args){

        new ClickMe2();
    }

    private JButton button1;

    public ClickMe2(){
        this.setSize(200,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("I'm listening");

        ClickListener cl = new ClickListener();

        JPanel panel1 = new JPanel();
        button1 = new JButton("Click ME");
        button1.addActionListener(cl);
        panel1.add(button1);
        this.add(panel1);

        this.setVisible(true);
    }

    private class ClickListener implements ActionListener{

        private int clickCount = 0;

        public void actionPerformed(ActionEvent e){

            if(e.getSource() == button1){

                clickCount++;
                System.out.print("count: "+ clickCount);
                if(clickCount % 2 == 0) {

                    button1.setText("I've been clicked!");
                }else{
                    button1.setText("I have been clicked " + clickCount + " times!");

                }
            }

        }
    }
}
