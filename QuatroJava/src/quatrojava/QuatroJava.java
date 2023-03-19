package quatrojava;

import javax.swing.JOptionPane;

public class QuatroJava {

    public static void main(String[] args) {
       int quantidade = 5;
       int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                numeros[i] = numero;
        }
        
        JOptionPane.showMessageDialog(null, "Posição Três:\n" + numeros[2]);
    }
    
}
