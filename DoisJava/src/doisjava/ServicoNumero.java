package doisjava;

import java.util.ArrayList;

public class ServicoNumero {
    
    public Integer pegarNumeroMaior(ArrayList<Integer> numerosDigitados){
        int numeroMaior = numerosDigitados.get(0);
        for (int i = 1; i < numerosDigitados.size(); i++) {
            if (numerosDigitados.get(i) > numeroMaior){
                numeroMaior = numerosDigitados.get(i);
            }
        }
        return numeroMaior;
    }
    
    public Integer pegarNumeroMenor(ArrayList<Integer> numerosDigitados) {
        int numeroMenor = numerosDigitados.get(0);
        for (int i = 1; i < numerosDigitados.size(); i++) {
            if(numerosDigitados.get(i) < numeroMenor) {
                numeroMenor = numerosDigitados.get(i);
            }
        }
        return numeroMenor;
    }
    
}
