package at.ac.fhkufstein.Aufgabe4;

import javax.swing.*;

public class Vergleichen {
    public static void main(String[] args) {

        String var1 = JOptionPane.showInputDialog("Geben Sie etwas ein: ");
        String var2 = JOptionPane.showInputDialog("Geben Sie etwas ein: ");
        String var3 = JOptionPane.showInputDialog("Geben Sie etwas ein: ");


        if (var1.equals(var2)) {
            System.out.println("var1 und var2 sind gleich!");
        }
        else if (var1.equals(var3)) {
            System.out.println("var1 und var3 sind gleich");
        }
        else {
            System.out.println("var2 und var3 sind gleich");
        }

    }
}