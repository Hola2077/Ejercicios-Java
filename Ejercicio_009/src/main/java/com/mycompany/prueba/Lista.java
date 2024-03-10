/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JOptionPane;

public class Lista {

    private Nodo ptr = null;
    private Nodo t = null;

    public Nodo getPtr() {
        return ptr;
    }

    /**
     * Metodo que sirve para ingresar un nodo dentro de una lisat simple
     * enlazada, el nodo retornara un valor boleano, el cual si es True
     * significa que el nodo fue agregado, en un caso contrario retorna False
     *
     * @param num Es el numero que quieres guardar en la lista
     * @param dere Valor que le permite indicar si se agrega po la derecha o por
     * la izquierda
     * @return True: nod agregado, false
     */
    public boolean ingresar_nodo(String num, boolean dere) {
        if (ptr == null) {
            ptr = new Nodo(num);
            t = ptr;
            return true;
        } else {
            if (dere == true) {
                ingresar_nodo_derecha(num);
            } else {
                ingresar_nodo_izquierda(num);
            }
            return true;
        }

    }

    private void ingresar_nodo_derecha(String num) {
        Nodo q = new Nodo(num);
        t.siguiente = q;
        t = q;

    }

    private void ingresar_nodo_izquierda(String num) {
        Nodo q = new Nodo(num);
        q.siguiente = ptr;
        ptr = q;
    }

    public void listar() {
        if (ptr != null) {
            Nodo temp = ptr;
            while (temp != null) {
                JOptionPane.showMessageDialog(null, temp.getNombre());
                temp = temp.siguiente;
            }
        }
    }

    public String listarS() {
        Nodo temp = ptr;
        String a = temp.toString();
        temp = temp.siguiente;
        return a;
    }

    public Nodo buscar(String num) {

        if (ptr != null) {
            Nodo temp = ptr;
            while (temp != null) {
                if (temp.getNombre() == num) {
                    return temp;
                }
                temp = temp.siguiente;
            }
        }
        return null;
    }

    public Nodo eliminar() {

        return null;
    }
}
