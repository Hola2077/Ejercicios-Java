package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author sistemas
 */
public class Prueba {

    private Lista lsA = new Lista();
    private Lista lsB = new Lista();
    private Lista lsApoyo = new Lista();

    public static void main(String[] args) {
        Prueba principal = new Prueba();
        principal.menu();
    }

    private void menu() {
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Lista Simple
                                                              1. Editar Lista A
                                                              2. Editar Lista B
                                                              3. Que elementos no son comunes en A y B
                                                              4. Que elementos estan en ambas listas A y B
                                                              5. Que elementos solo estan en las lista A
                                                              6. Que elementos solo estan en las lista B
                                                              7. Salir"""
            ));
            switch (op) {
                case 1: {
                    subMenu(lsA);
                }
                break;
                case 2: {
                    subMenu(lsB);
                }
                break;
                case 3: {
                    Lista lsA = this.lsA;
                    Lista lsB = this.lsB;
                    if (lsB != null && lsA != null) {
                        boolean okA = false;
                        boolean okB = false;
                        
                        while (okA == false && okB == false) {
                            
                        }
                    }
                    lsApoyo.listar();
                }
                break;

                case 4: {

                }
                break;

                case 5: {
                }
                break;
                case 6: {

                }
                break;
                case 7: {
                    System.exit(0);
                    ////Salir////
                }
                break;
                default: menu();
                break;
            }

        } while (op != 7);
    }

    private void subMenu(Lista ls) {
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Lista Simple
                                                              1. Ingresar Nodo
                                                              2. Recorrer la Lista
                                                              3. Buscar Elemento
                                                              4. Eliminar
                                                              5. Atras"""
            ));
            switch (op) {
                case 1: {
                    String numero = JOptionPane.showInputDialog("Digite un Numero");
                    int op1 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione una opcion
                                                                            1. Ingresar por la derecha
                                                                            2. Ingresar por la izquierda"""));
                    boolean posi;
                    if (op1 == 1) {
                        posi = true;
                    } else {
                        posi = false;
                    }

                    if (ls.ingresar_nodo(numero, posi)) {
                        JOptionPane.showMessageDialog(null, "Dato Agregado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato No Agregado");
                    }
                }
                break;
                case 2: {

                    ls.listar();
                }
                break;
                case 3: {
                    String numero = JOptionPane.showInputDialog("Dato a Buscar");
                    Nodo x = ls.buscar(numero);
                    if (x != null) {
                        JOptionPane.showMessageDialog(null, "Dato Si existe");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato No existe");
                    }
                    menu();
                }
                break;

                case 4: {
                    ls.eliminar();
                }
                break;

                case 5: {
                    menu();
                }
                break;
            }

        } while (op != 3);
    }
}
