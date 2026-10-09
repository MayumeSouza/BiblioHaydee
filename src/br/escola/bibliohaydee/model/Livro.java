package br.escola.bibliohaydee.model;
public class Livro {

    String titulo;
    String isbn;
    Autor autor;
    int anoPublicacao;
    String genero;
    boolean disponivel;

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
