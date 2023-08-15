package com.mycompany.mavenproject1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Mavenproject1 {

    public static void main(String[] args) {
        int dimencionUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las dimenciones del array 1"));
        int dimencionDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las dimenciones del array 2"));
        int arrayUno[] = new int[dimencionUno];
        int arrayDos[] = new int[dimencionDos];
        int primerPuntoUno[] = new int[dimencionUno + dimencionDos];
        for (int a = 0; a < dimencionUno; a++) {
            arrayUno[a] = (int) Math.floor(Math.random() * 101);
            primerPuntoUno[a] = arrayUno[a];
        }
        for (int a = 0; a < dimencionDos; a++) {
            arrayDos[a] = (int) Math.floor(Math.random() * 101);
            primerPuntoUno[dimencionUno + a] = arrayDos[a];
        }

        JOptionPane.showMessageDialog(null, "Array 1:  " + Arrays.toString(arrayUno) + "\n" + "Array 2:  " + Arrays.toString(arrayDos) + "\n" + "Punto 1:  " + Arrays.toString(primerPuntoUno));
    }
}
