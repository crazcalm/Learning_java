package com.github.crazcalm.SwingOrderPizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;

/**
 * Created by marcuswillock on 5/15/15.
 */
public class Pizza extends JFrame {
    public static void main(String[] args) {

        new Pizza();
    }

    private JButton buttonOK;
    private JRadioButton small, medium, large;
    private JCheckBox pepperoni, mushrooms, anchovies;

    public Pizza() {

        this.setSize(320, 200);
        this.setTitle("Order your Pizza");
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        ButtonListener b1 = new ButtonListener();

        JPanel mainPanel = new JPanel();
        JPanel sizePanel = new JPanel();

        Border boarder1 = BorderFactory.createTitledBorder("Size");
        sizePanel.setBorder(boarder1);

        ButtonGroup sizeGroup = new ButtonGroup();

        small = new JRadioButton("Small");
        small.setSelected(true);
        sizePanel.add(small);
        sizeGroup.add(small);

        medium = new JRadioButton("Meduim");
        sizePanel.add(medium);
        sizeGroup.add(medium);

        large = new JRadioButton("Large");
        sizePanel.add(large);
        sizeGroup.add(large);

        mainPanel.add(sizePanel);

        JPanel topPanel = new JPanel();
        Border b2 = BorderFactory.createTitledBorder("Toppings");
        topPanel.setBorder(b2);

        pepperoni = new JCheckBox("pepperoni");
        topPanel.add(pepperoni);

        mushrooms = new JCheckBox("mushrooms");
        topPanel.add(mushrooms);

        anchovies = new JCheckBox("anchovies");
        topPanel.add(anchovies);

        mainPanel.add(topPanel);

        buttonOK = new JButton("OK");
        buttonOK.addActionListener(b1);
        mainPanel.add(buttonOK);

        this.add(mainPanel);

        this.setVisible(true);

    }

    private class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            if(e.getSource() == buttonOK){

                String tops = "";
                if (pepperoni.isSelected()){
                    tops += "Pepperoni\n";
                }
                if (mushrooms.isSelected()){
                    tops += "Mushrooms\n";
                }
                if (anchovies.isSelected()){
                    tops += "Anchovies\n";
                }

                String msg = "You ordered a ";
                if (small.isSelected()){
                    msg += "small pizza with ";
                }
                if (medium.isSelected()){
                    msg += "medium pizza with ";
                }
                if (large.isSelected()){
                    msg += "large pizza with ";
                }

                if (tops.equals("")){
                    msg += "no toppings.";
                }
                else{
                    msg += "the following toppings: \n" + tops;
                }

                JOptionPane.showMessageDialog(
                        buttonOK,
                        msg,
                        "You Order",
                        JOptionPane.INFORMATION_MESSAGE
                );

                pepperoni.setSelected(false);
                mushrooms.setSelected(false);
                anchovies.setSelected(false);
                small.setSelected(true);
            }
        }
    }



}
