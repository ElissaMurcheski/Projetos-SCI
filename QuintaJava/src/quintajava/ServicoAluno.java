package quintajava;

public class ServicoAluno {

    public double pegarMedia(double[] notas) {
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        return total / notas.length;
    }

    public String pegarNomeMaiorMedia(double[][] notas, String[] nomes) {
        double maiorMedia = 0;
        String nomeAluno = "";
        for (int i = 0; i < nomes.length; i++) {
            double media = pegarMedia(notas[i]);
            if (media > maiorMedia) {
                maiorMedia = media;
                nomeAluno = nomes[i];
            }
        }
        return nomeAluno;
    }

    public String pegarNomeMenorMedia(double[][] notas, String[] nomes) {
        double menorMedia = Integer.MAX_VALUE;
        String nomeAluno = "";
        for (int i = 0; i < nomes.length; i++) {
            double media = pegarMedia(notas[i]);
            if (media < menorMedia) {
                menorMedia = media;
                nomeAluno = nomes[i];
            }
        }
        return nomeAluno;
    }
}
