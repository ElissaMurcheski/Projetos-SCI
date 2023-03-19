package umjava;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UmJava {

    public static void main(String[] args) {
       
        ArrayList<Integer> numerosDigitados = new ArrayList<>(); 
        
        for (int i = 0; i < 5; i++) {
            Integer numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            numerosDigitados.add(numeroDigitado);
        }
        
        ServicoNumeros servicoNumero = new ServicoNumeros();
        ArrayList<Integer> numerosPares = servicoNumero.pegarNumerosPares(numerosDigitados);
        ArrayList<Integer> numerosImpares = servicoNumero.pegarNumerosImpares(numerosDigitados);
        double mediaGeral = servicoNumero.mediaGeralNumeros(numerosDigitados);
        
        String resposta = " ------ Números Pares ----- " + "\n" + numerosPares;
        resposta += "\n ----- Números Ímpares -----" + "\n" + numerosImpares;
        resposta += "\n ----- Média Geral -----" + "\n" + mediaGeral;   
        
        JOptionPane.showMessageDialog(null, resposta);
    }
}
    
