import javax.swing.JOptionPane;


public class Principal {

    Arbol_binario abin = new Arbol_binario();

    public static void main(String[] args) {
        Principal principal = new Principal();

        principal.menu();
    }

    private void menu() {
        abin.insertar(12);
        abin.insertar(8);
        abin.insertar(4);
        abin.insertar(9);
        abin.insertar(3);
        abin.insertar(1);
        abin.insertar(7);
        abin.insertar(13);
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Menu de opciones.
                                                              1. Insertar un elemento.
                                                              2. Recorrer el arbol.
                                                              3. Buscar un elemento.
                                                              4. Eliminar un elemento.
                                                              5. Salir.
                                                              """));
            switch (op) {
                case 1: {
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
                    if (abin.insertar(num)) {
                        JOptionPane.showMessageDialog(null, "Dato agregado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato no agregado.");
                    }
                }
                break;
                case 2:
                {
                    if (abin.getRaiz() != null) {
                        do {                            
                            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                              Recorridos
                                                                              1. Preorden
                                                                              2. Inorden
                                                                              3. Posorden
                                                                              4. Salir
                                                                              """));
                            abin.recorridos(op);
                        } while (op != 4);
                    }else{
                        JOptionPane.showMessageDialog(null, "Arbol Vacio");
                    }
                }
                    break;
                case 3: 
                {
                    if(abin.getRaiz() != null){
                        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
                        Nodo temp = abin.buscar_elemento(num);
                        if(temp != null){
                            JOptionPane.showMessageDialog(null, "Si existe");
                        }else{
                            JOptionPane.showMessageDialog(null, "No existe");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Arbol Vacio");
                    }
                }
                break;
                case 4: {abin.eliminar_elemento(Integer.parseInt(JOptionPane.showInputDialog
                        ("Digite el numero que va eliminar")));
                    abin.recorridos(2);}
                    break;
            }
        } while (op != 5);
    }

}
