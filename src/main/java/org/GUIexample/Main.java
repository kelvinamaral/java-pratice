package org.GUIexample;

import javax.swing.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + nome);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Your Age is: " + age);

        String input = JOptionPane.showInputDialog("Enter your height (use a comma or a period as the decimal separator):");

        try {
            NumberFormat format = NumberFormat.getInstance();
            double height = format.parse(input).doubleValue();
            JOptionPane.showMessageDialog(null, "Your height is: " + height);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Make sure to use a comma or a period as the decimal separator.");
        }
    }
}