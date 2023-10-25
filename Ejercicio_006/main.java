import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        elipse elipse = new elipse();
        elipse.setR1(Double.parseDouble(JOptionPane.showInputDialog("Digite R1")));
        elipse.setR2(Double.parseDouble(JOptionPane.showInputDialog("Digite R2")));
        elipse.procesarArea();
        elipse.procesarPerimetro();
        JOptionPane.showMessageDialog(null, "Area:  " + elipse.getArea() + "\n" + "Perimetro:  " + elipse.getPerimetro());
    }
}