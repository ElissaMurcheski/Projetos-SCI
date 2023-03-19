package doisjava;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DoisJava {

    public static void main(String[] args) {
        
        ArrayList<Integer> numerosDigitados = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            numerosDigitados.add(numeroDigitado);
        }
        
        ServicoNumero servicoNumero = new ServicoNumero();
        int numeroMaior = servicoNumero.pegarNumeroMaior(numerosDigitados);
        int numeroMenor = servicoNumero.pegarNumeroMenor(numerosDigitados);
        
        String resposta = "----- Número Maior ----- \n" + numeroMaior;
        resposta += "\n ----- Número Menor ----- \n" + numeroMenor;      
        
        JOptionPane.showMessageDialog(null, resposta);
    }
    
}
