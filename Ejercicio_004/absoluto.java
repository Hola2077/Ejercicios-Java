public class Absoluto {

    private double numero;

    public Absoluto() {
        numero = 0;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double x) {
        numero = x;
    }

    public void procesar() {
        if (numero < 0) {
            numero = numero * -1;
        }
    }
}