package com.SuperPower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

import static com.SuperPower.InitCurrency.printCurrency;


public class CurrencyConverterV2 {


    public static void converter() {

        JFrame fit = new JFrame("CurrencyConverterV2 Converter",null);
        JLabel lb1, lb2;
        JTextField txt1, txt2;
        JButton b1,b2, b3;

        lb1 = new JLabel("Yen: ");
        lb1.setBounds(30, 40, 80, 30);
        lb2 = new JLabel(" Dollars: ");
        lb2.setBounds(180, 40, 80, 30);

        txt1 = new JTextField("0");
        txt1.setBounds(80, 40, 100, 30);
        txt2 = new JTextField("0");
        txt2.setBounds(240, 40, 100, 30);

        b1 = new JButton("convert");
        b1.setBounds(170, 110, 60, 20);
        b3 = new JButton("close");
        b3.setBounds(170, 150, 60, 30);
        b1.addActionListener(e -> {

                    double d = Double.parseDouble(txt2.getText());
                    double d1 = (d / 0.1419);
                    String str1 = String.valueOf(d1);
                    String loc1 = printCurrency(Locale.CHINESE);
                    String typ = loc1 + (str1);
                    txt1.setText(typ);
                });

        b1.addActionListener(e -> {

                double dx = Double.parseDouble(txt1.getText());
            double d2 = (dx * 0.1410);
            String str2 = String.valueOf(d2);
            String loc2 =  printCurrency(Locale.US);
            String typ2 = loc2 + (str2);
            txt2.setText(typ2);
        });

        b3.addActionListener(e -> fit.dispose());
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
        fit.add(b1);
        fit.add(b3);

        fit.setLayout(null);
        fit.setSize(400,400);
        fit.getContentPane().setBackground(Color.pink);
        fit.setVisible(true);
    }
    public static void main(String args[]){
        converter();

    }
}

