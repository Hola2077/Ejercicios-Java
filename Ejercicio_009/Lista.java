import javax.swing.JOptionPane;

public class Lista {

    private Nodo ptr = null;
    private Nodo t = null;

    public Nodo getPtr() {
        return ptr;
    }


    /**
     * Método que sirve para ingresar un nodo dentro de una lista simple
     * enlazada, el nodo retornara un valor boleano, el cual si es True
     * significa que el nodo fue agregado, en caso contrario retornara False.
     *
     * @param num: Es el numero que quiero guardar en mi lista.
     * @param dere: Valor que permite indicar si se agrega por la derecha o por
     * la izquierda.
     * @return True: nodo agregado, False: nodo no agregado.
     */
    public boolean ingresar_nodo(String num, boolean dere) {
        if (ptr == null) {
            ptr = new Nodo(num);
            t = ptr;
            return true;
        } else {
            Nodo temp = buscar_elemento(num);
            if (temp == null) {
                if (dere) {

                    ingresar_nodo_derecha(num);
                } else {

                    ingresar_nodo_izquierda(num);
                }
                return true;
            } else {
                return false;
            }
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

    public void mostrar_lista() {
        if (ptr != null) {
            Nodo temp = ptr;
            while (temp != null) {
                JOptionPane.showMessageDialog(null, temp.toString());
                temp = temp.siguiente;
            }
        }
    }

    public Nodo buscar_elemento(String num) {
        if (ptr != null) {
            Nodo temp = ptr;
            while (temp != null) {
                if (temp.getNumero().equals(num)) {
                    return temp;
                }
                temp = temp.siguiente;
            }
        }
        return null;
    }

    public boolean eliminar_nodo(Nodo x) {
        if (ptr == null) {
            return false;
        }
        if (ptr == x) {
            ptr = ptr.siguiente;
            return true;
        }
        Nodo temp = ptr;
        while (temp != null && temp.siguiente != x) {
            temp = temp.siguiente;
        }

        if (temp == null) {
            return false;
        }

        temp.siguiente = x.siguiente;
        return true;
    }


    public static void imprimirElementosNoComunes(Lista lsA, Lista lsB) {
        Nodo tempA = lsA.getPtr();
        Nodo tempB = lsB.getPtr();

        while (tempA != null) {
            if (lsB.buscar_elemento(tempA.getNumero()) == null) {
                JOptionPane.showMessageDialog(null,"Elementos no comunes en la Lista A: "+"\n"+tempA.getNumero());
            }
            tempA = tempA.siguiente;
        }


        while (tempB != null) {
            if (lsA.buscar_elemento(tempB.getNumero()) == null) {
                JOptionPane.showMessageDialog(null,"Elementos no comunes en la Lista B: "+"\n"+tempB.getNumero());
            }
            tempB = tempB.siguiente;
        }
    }

    public static void imprimirElementosComunes(Lista lsA, Lista lsB) {
        Nodo tempA = lsA.getPtr();

        while (tempA != null) {
            if (lsB.buscar_elemento(tempA.getNumero()) != null) {
                JOptionPane.showMessageDialog(null,"Elementos comunes en Listas A y B: "+"\n"+tempA.getNumero());
            }
            tempA = tempA.siguiente;
        }
    }

    public static void imprimirElementosQueSoloAparecenA(Lista lsA, Lista lsB) {
        Nodo tempA = lsA.getPtr();
        while (tempA != null) {
            if (lsB.buscar_elemento(tempA.getNumero()) == null) {
                JOptionPane.showMessageDialog(null,"Elementos que solo Aparecen en la Lista A: "+"\n"+tempA.getNumero());
            }
            tempA = tempA.siguiente;
        }
    }
    public static void imprimirElementosQueSoloAparecenB(Lista lsA, Lista lsB) {
        Nodo tempB = lsB.getPtr();
        while (tempB != null) {
            if (lsA.buscar_elemento(tempB.getNumero()) == null) {
                JOptionPane.showMessageDialog(null,"Elementos que solo Aparecen en la Lista B: "+"\n"+tempB.getNumero());
            }
            tempB = tempB.siguiente;
        }
    }

}