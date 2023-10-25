///////Devolver valor absoluto de un numero////////

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        absoluto absoluto = new absoluto();
        absoluto.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero")));
        absoluto.procesar();
        JOptionPane.showMessageDialog(null,"Valor Absoluto es: "+absoluto.getNumero());
    }
}