public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
            this.titulo = titulo;
            this.autor = autor;
            this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Livro o) {
        return Double.compare(this.preco, o.preco);
    }

    @Override
    public String toString() {
        return this.titulo + " - " + this.autor + " - " + this.preco;
    }
}
