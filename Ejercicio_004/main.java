///////Devolver valor absoluto de un numero////////

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Absoluto absoluto = new Absoluto();
        absoluto.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero")));
        absoluto.procesar();
        JOptionPane.showMessageDialog(null,"Valor Absoluto es: "+absoluto.getNumero());
    }
}