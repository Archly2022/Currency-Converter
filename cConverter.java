package com.example.divas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class cConverter {

    public static void converter() {

        JFrame fit = new JFrame("Currency Converter",null);
        JLabel lb1, lb2;
        JTextField txt1, txt2;
        JButton b1, b2, b3;

        lb1 = new JLabel("Cedis: ");
        lb1.setBounds(30, 40, 80, 30);
        lb2 = new JLabel(" Dollars: ");
        lb2.setBounds(180, 40, 80, 30);

        txt1 = new JTextField("0");
        txt1.setBounds(80, 40, 100, 30);
        txt2 = new JTextField("0");
        txt2.setBounds(240, 40, 100, 30);

        b1 = new JButton("Cedis");
        b1.setBounds(90, 80, 60, 20);
        b2 = new JButton("Dollar");
        b2.setBounds(250, 80, 60, 20);
        b3 = new JButton("close");
        b3.setBounds(170, 150, 60, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d = Double.parseDouble(txt2.getText());
                double d1 = (d / 0.1419);
                String str1 = String.valueOf(d1);
                txt1.setText(str1);
            }
        });
        b2.addActionListener(e -> {
            double dx = Double.parseDouble(txt1.getText());
            double d2 = (dx * 0.1410);
            String str2 = String.valueOf(d2);
            txt2.setText(str2);
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fit.dispose();
            }
        });
        fit.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        fit.add(lb1);
        fit.add(txt1);
        fit.add(lb2);
        fit.add(txt2);
        fit.add(b1);
        fit.add(b2);
        fit.add(b3);

        fit.setLayout(null);
        fit.setSize(400,400);
        fit.setVisible(true);

    }
    public static void main(String args[]){
        converter();

    }
}