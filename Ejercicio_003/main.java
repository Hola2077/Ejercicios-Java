import java.util.*;
import javax.swing.JOptionPane;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner ingresa = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la dimension: "));
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.floor(Math.random() * 101);
        }
        int arrayAntes[] = array.clone();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < (n / 2); i++) {
            int temp = array[i];
            array[i] = array[array.length / 2 - 1];
            array[array.length / 2 - 1] = temp;
        }
        JOptionPane.showMessageDialog(null, "Su array es:  " + Arrays.toString(arrayAntes) + "\n" + "Su array invertido es:  " + Arrays.toString(array));
    }
}