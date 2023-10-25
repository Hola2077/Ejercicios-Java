//////Hallar definitiva de los 3 cortes///////
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        nota nota = new nota();
        nota.setCorteUno(Double.parseDouble(JOptionPane.showInputDialog("Corte Uno")));
        nota.setCorteDos(Double.parseDouble(JOptionPane.showInputDialog("Corte Dos")));
        nota.setCorteTres(Double.parseDouble(JOptionPane.showInputDialog("Corte Tres")));
        nota.procesarDefinitiva();
        JOptionPane.showMessageDialog(null,"Definitiva delos 3 cortes:  " + nota.getDefinitiva());
    }
}