package umjava;

import java.util.ArrayList;

public class ServicoNumeros {
    
    public ArrayList<Integer> pegarNumerosPares(ArrayList<Integer> numerosDigitados) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        
        for (int i = 0; i < numerosDigitados.size(); i++) {
            int numero = numerosDigitados.get(i);
            if (numero%2 == 0){
                numerosPares.add(numero); 
            }
        }
        return numerosPares;
    }
    
    public ArrayList<Integer> pegarNumerosImpares(ArrayList<Integer> numerosDigitados){
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        
        for (int i = 0; i < numerosDigitados.size(); i++) {
            int numero = numerosDigitados.get(i);
            if (numero%2 != 0){
                numerosImpares.add(numero);
            }
        }
        return numerosImpares;
    }
    
    public double mediaGeralNumeros(ArrayList<Integer> numerosDigitados){
        double total = 0;
        for (int i = 0; i < numerosDigitados.size(); i++) {
            int numero = numerosDigitados.get(i);
            total = total + numero;
        }
        return total/numerosDigitados.size();
    }
    
}
