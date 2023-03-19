package tresjava;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(int quantidadeNotas) {
        notas = new double[quantidadeNotas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
}
