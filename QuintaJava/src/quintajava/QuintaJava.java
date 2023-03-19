package quintajava;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class QuintaJava {

    public static void main(String[] args) {
        int qntLinhas = 3;
        int qntColunas = 4;
        double[][] notas = new double[qntLinhas][qntColunas];
        String[] nomes = new String[qntLinhas];

        for (int i = 0; i < qntLinhas; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
            nomes[i] = nome;

            for (int j = 0; j < qntColunas; j++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
                notas[i][j] = nota;

            }
        }
        String respostas = "";
        DecimalFormat df = new DecimalFormat("#0.0");
        ServicoAluno servicoAluno = new ServicoAluno();
        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            respostas += "\nNome Aluno: " + nome;
            respostas += "\nMédia: " + df.format(servicoAluno.pegarMedia(notas[i]));
            respostas += "\n--------------------";
        }
        respostas += "\n\nMaior Média: " + servicoAluno.pegarNomeMaiorMedia(notas, nomes);
        respostas += "\nMenor Média: " + servicoAluno.pegarNomeMenorMedia(notas, nomes);
        respostas += "\n";
        JOptionPane.showMessageDialog(null, respostas);
    }

}
