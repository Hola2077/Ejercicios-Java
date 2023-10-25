///////Hallar el Area y la Circunferencia de un Circulo Apartir del Radio///////

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        circulo circulo = new circulo();
        circulo.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite el Valor del Radio")));
        circulo.procesarArea();
        circulo.procesarCircunferencia();
        JOptionPane.showMessageDialog(null, "Area:  " + circulo.getArea() + "\n" + "Circunferencia:  " + circulo.getCircunferencia());
    }
}