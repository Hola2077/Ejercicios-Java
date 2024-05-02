public class Arbol_binario {

    private Nodo raiz = null;

    public Nodo getRaiz() {
        return raiz;
    }

    boolean insertado = false;

    public boolean insertar(int num) {
        insertado = false;
        raiz = insertar(raiz, num);
        return insertado;
    }

    private Nodo insertar(Nodo r, int num) {
        if (r == null) {
            r = new Nodo(num);
            insertado = true;
            return r;
        }
        if (num < r.getNum()) {
            //izquierdo
            r.izquierda = insertar(r.izquierda, num);
        } else if (num > r.getNum()) {
            r.derecha = insertar(r.derecha, num);
        }
        return r;
    }

    public void recorridos(int forma) {
        switch (forma) {
            case 1:
                System.out.println("Inicio Preorden");
                preorden(raiz);
                System.out.println("Fin Preorden");
                break;
            case 2:
                System.out.println("Inicio Inorden");
                inorden(raiz);
                System.out.println("Fin Inorden");
                break;
            case 3:
                System.out.println("Inicio Posorden");
                posorden(raiz);
                System.out.println("Fin Posorden");
                break;

        }
    }

    private void preorden(Nodo r) {
        if (r != null) {
            System.out.println(r.getNum());
            preorden(r.izquierda);
            preorden(r.derecha);
        }
    }

    private void inorden(Nodo r) {
        if (r != null) {
            inorden(r.izquierda);
            System.out.println(r.getNum());
            inorden(r.derecha);
        }
    }

    private void posorden(Nodo r) {
        if (r != null) {
            posorden(r.izquierda);
            posorden(r.derecha);
            System.out.println(r.getNum());
        }
    }
    
    public Nodo buscar_elemento(int num){
        return buscar_elemento(raiz, num);
    }
    
    private Nodo buscar_elemento(Nodo r, int num){
        if(r != null){
            int info = r.getNum();
            if(num == info){
                return r;
            }else{
                if(info < num){
                    return buscar_elemento(r.derecha, num);
                }else {return buscar_elemento(r.izquierda, num);}
            }
        }
        return null;
    }

    public Nodo nodoAntecesor(Nodo r) {
        return nodoAntecesor(raiz, r);
    }

    public Nodo nodoAntecesor(Nodo temp, Nodo r) {

        if (temp == null || r == null) {
            return null;
        }

        if (temp.izquierda == r) {
            return temp;
        }

        if (temp.derecha == r) {
            return temp;
        }

        if (r.getNum() < temp.getNum()) {
            return nodoAntecesor(temp.izquierda, r);
        }

        return nodoAntecesor(temp.derecha, r);
    }

    public void eliminar_elemento(int num) {
        raiz = eliminar_elemento(raiz, num);
    }

    private Nodo eliminar_elemento(Nodo temp, int num) {
        // Caso base: si la raíz es nula, no hay nada que eliminar
        if (temp == null) {
            return null;
        }

        // Si el valor a eliminar es menor que el valor de la raíz, buscar en el subárbol izquierdo
        if (num < temp.getNum()) {
            temp.izquierda = eliminar_elemento(temp.izquierda, num);
        }
        // Si el valor a eliminar es mayor que el valor de la raíz, buscar en el subárbol derecho
        else if (num > temp.getNum()) {
            temp.derecha = eliminar_elemento(temp.derecha, num);
        }
        // Si el valor a eliminar es igual al valor de la raíz, entonces este es el nodo que queremos eliminar
        else {
            // Caso 1: Nodo es una hoja
            if (temp.izquierda == null && temp.derecha == null) {
                return null;
            }
            // Caso 2: Nodo tiene un solo hijo
            else if (temp.izquierda == null) {
                return temp.derecha;
            } else if (temp.derecha == null) {
                return temp.izquierda;
            }
            // Caso 3: Nodo tiene dos hijos
            else {
                // Encontramos el sucesor del nodo
                Nodo sucesorValor = nodoSucesor(temp.derecha);
                temp.setNum(sucesorValor.getNum());
                // Eliminamos el sucesor del subárbol derecho
                temp.derecha = eliminar_elemento(temp.derecha, sucesorValor.getNum());
            }
        }
        return temp;
    }

    private Nodo nodoSucesor(Nodo nodo) {
        if (nodo.izquierda == null) {
            return nodo;
        }
        return nodoSucesor(nodo.izquierda);
    }
    
}
