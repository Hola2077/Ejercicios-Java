import javax.swing.JOptionPane;


public class Prueba {

    private final Lista lsA = new Lista();
    private final Lista lsB = new Lista();


    public static void main(String[] args) {
        Prueba principal = new Prueba();
        principal.menu();
    }

    private void menu() {
        int op;
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
                    Lista.imprimirElementosNoComunes(lsA,lsB);
                }
                break;

                case 4: {
                    Lista.imprimirElementosComunes(lsA,lsB);
                }
                break;

                case 5: {
                    Lista.imprimirElementosQueSoloAparecenA(lsA,lsB);
                }
                break;

                case 6: {
                    Lista.imprimirElementosQueSoloAparecenB(lsA,lsB);
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

        } while (op != 8);
    }

    private void subMenu(Lista ls) {
        int op;
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
                    String numero = JOptionPane.showInputDialog("Digite un numero:");

                        int op1 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione una opcion
                                                                            1. Ingresar por la derecha
                                                                            2. Ingresar por la izquierda"""));
                        boolean posi;
                        posi = op1 == 1;
                        if (!ls.ingresar_nodo(numero, posi)) {
                            JOptionPane.showMessageDialog(null, "Dato No Agregado");
                        }



                }
                break;
                case 2: {

                    ls.mostrar_lista();
                }
                break;
                case 3: {
                    String numero = JOptionPane.showInputDialog("Digite el numero para Buscarlo:");

                    if (ls.buscar_elemento(numero) != null) {
                        JOptionPane.showMessageDialog(null, "Dato Si existe");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato No existe");
                    }
                    menu();
                }
                break;

                case 4: {
                    String numero = JOptionPane.showInputDialog("Digite un numero a eliminar:");
                    Nodo x = ls.buscar_elemento(numero);
                    if (ls.eliminar_nodo(x)) {
                        JOptionPane.showMessageDialog(null, "El dato fue eliminado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dato no fue eliminado.");
                    }
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