package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab01_2 {
    private JPanel panel;
    private JButton sprawdzButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel wynik;

    public lab01_2() {
        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =  Integer.parseInt(textField1.getText());
                int b =  Integer.parseInt(textField2.getText());
                if(a == b){
                    wynik.setText("są równe");
                }else{
                if(a < b){
                    wynik.setText("Wieksza jest b");
                }else{
                    wynik.setText("Wieksza jest a");
                }
            }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(new lab01_2().panel);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }


}
