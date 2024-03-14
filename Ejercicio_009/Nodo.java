public class Nodo {
    private String numero = "";

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return numero;
    }

    public String getNumero() {return numero;}

    public Nodo siguiente = null;

    Nodo(String numero ){
        this.numero = numero;
    }

    @Override
    public String toString() {
        return ""+numero;
    }


}