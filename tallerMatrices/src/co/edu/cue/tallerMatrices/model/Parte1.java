package co.edu.cue.tallerMatrices.model;

import javax.swing.*;
import java.sql.SQLOutput;

public class Parte1 {
     int matrizNumeros [][];


    public void llenarMatriz() {
        int filas= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de filas"));
        int columnas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de columnas"));
        matrizNumeros= new int[filas][columnas];

        System.out.println("columnas: "+matrizNumeros[0].length);
        System.out.println("filas: "+matrizNumeros.length);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizNumeros[i][j]=(int)(Math.random()*((10-1)+1)+1);
            }

        }
    }

    public void imprimirMatriz() {
        System.out.println("matriz impresa: ");

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {

                System.out.print(""+matrizNumeros[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public void numeroMayor(){
        int contador=0;
        for (int i = 0; i < matrizNumeros.length; i++){
            for (int j=0;j< matrizNumeros.length;j++){
                if (contador<matrizNumeros[i][j]){
                    contador=matrizNumeros[i][j];
                }
            }
        }
        System.out.println(String.valueOf("El numero mayor en la matriz es "+contador));
    }

    public void posicion(){
        int matriz[][];
        int filas=5;
        int columnas=5;
        int contFila=0;
        int contColumna=0;
        int cont=0;
        matriz= new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor para la posición, los numeros deben ser diferentes "+i+j));
                if (cont<matriz[i][j]){
                    cont=matriz[i][j];
                    contFila=i;
                    contColumna=j;
                }
            }
        }
        System.out.println(String.valueOf("El numero mayor en la matriz es "+cont+" y su posicion en la fila es "+contFila+" y en columna es "+contColumna));

    }
}

