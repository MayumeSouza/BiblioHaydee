package br.escola.bibliohaydee.model;
public class Livro {

    private String titulo;
    private String isbn;
    private Autor autor;
    private int anoPublicacao;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, String isbn, Autor autor, Integer anoDePublicacao) {
        this(titulo, isbn, autor, anoDePublicacao, "Não informado");
    }
    public Livro(String titulo, String isbn, Autor autor, int anoPublicacao, String genero) {

        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.disponivel = true;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
