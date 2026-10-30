package br.escola.bibliohaydee.model;

public class Autor {
   private String nome;
   private String nacionalidade;
   private int anoNascimento;

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", anoNascimento=" + anoNascimento +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Autor() {
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}