package tresjava;

public class ServicoAluno {

    public double pegarMedia(double[] notas) {
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        return total / notas.length;
    }

    public boolean aprovado(double[] notas) {
        double media = pegarMedia(notas);

        return media >= 6;
    }

}
