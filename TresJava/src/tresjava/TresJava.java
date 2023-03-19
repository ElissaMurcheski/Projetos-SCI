package tresjava;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TresJava {

    public static void main(String[] args) {
        int quantidade = 4;
        boolean continuar;
        ArrayList<Aluno> alunos = new ArrayList<>();
        do {
            double[] notas = new double[quantidade];
            String nome = JOptionPane.showInputDialog("Digite o nome do(a) Aluno(a): ");

            for (int i = 0; i < quantidade; i++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
                notas[i] = nota;
            }

            Aluno aluno = new Aluno(quantidade);
            aluno.setNome(nome);
            aluno.setNotas(notas);
            alunos.add(aluno);

            continuar = JOptionPane.showInputDialog("Deseja cadastrar mais alunos?" + "\n S - Sim ou N - Não").equalsIgnoreCase("s");

        } while (continuar);

        ServicoAluno servicoAluno = new ServicoAluno();
        String resposta = "";
        DecimalFormat df = new DecimalFormat("#0.0");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            resposta += "Aluno: " + aluno.getNome();
            resposta += "\nMédia: " + df.format(servicoAluno.pegarMedia(aluno.getNotas()));

            if (servicoAluno.aprovado(aluno.getNotas())) {
                resposta += "\nAprovado!";
            } else {
                resposta += "\nReprovado!!";
            } 
            resposta += "\n--------------------\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
    }

}
