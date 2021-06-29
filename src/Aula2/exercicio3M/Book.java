package Aula2.exercicio3M;

public class Book {
    private String titulo;
    private String isbn;
    private String autor;

    public Book() {
        this.titulo = "";
        this.isbn = "";
        this.autor = "";
    }

    public Book(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void emprestimo() {

    }

    public void devolver() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return this.titulo + " " + this.isbn + " " + this.autor;
    }
}
