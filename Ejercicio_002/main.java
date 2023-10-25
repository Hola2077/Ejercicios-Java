import java.util.*;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        final int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la dimension:"));
        int array[] = new int[n];
        int arrayInvertido[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.floor(Math.random() * 101);
        }

        int sumar = 0, restar = array.length;
        while (sumar != array.length && restar != 0) {
            restar--;
            arrayInvertido[restar] = array[sumar];
            sumar++;
        }
        JOptionPane.showMessageDialog(null, "Su array es:  " + Arrays.toString(array) + "\n" + "Su array invertido es:  " + Arrays.toString(arrayInvertido));
    }
}