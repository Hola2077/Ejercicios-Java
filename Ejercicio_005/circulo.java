public class Circulo {

    private double radio;
    private double area;
    private double circunferencia;

    public Circulo() {
        radio = 0;
        area = 0;
        circunferencia = 0;
    }

    public double getArea() {
        return area;
    }

    public double getCircunferencia() {
        return circunferencia;
    }
    
    public void setNumero(double x) {
        radio = x;
    }

    public void procesarArea() {
        area = Math.PI * radio * radio;
    }

    public void procesarCircunferencia() {
        circunferencia = Math.PI * 2 * radio;
    }
}