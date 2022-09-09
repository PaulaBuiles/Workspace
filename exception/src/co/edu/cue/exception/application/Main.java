package co.edu.cue.exception.application;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String a= JOptionPane.showInputDialog(null,"Ingrese el primer numero");
        String b= JOptionPane.showInputDialog(null,"Ingrese el segundo numero numero");

        double a1= Double.parseDouble(a);
        double a2= Double.parseDouble(b);

        addition(a1, a2);
        subtraction(a1, a2);
        division(a1,a2);


    }
    public static void addition(double a1, double a2){
        try {
            double addition = a1+a2;
            JOptionPane.showMessageDialog(null,"el resultado de la suma entre "+a1 + a2 +" es: "+addition);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingreso un caracter no valido  solo numeros)", "Dialogo de ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    public static void subtraction(double a1, double a2) {
        try {
            double subtraction = a1 - a2;
            JOptionPane.showMessageDialog(null, "el resultado de la resta entre " + a1 + a2 + " es: " + subtraction);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingreso un caracter no valido  solo numeros)", "Dialogo de ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void division(double a1, double a2){
        try {
            double division = a1/a2;
            JOptionPane.showMessageDialog(null,"el resultado de la division entre "+a1 +a2 +" es: "+division);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido  solo numeros)","Dialogo de ERROR", JOptionPane.ERROR_MESSAGE);
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Division por cero","Dialogo de ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}