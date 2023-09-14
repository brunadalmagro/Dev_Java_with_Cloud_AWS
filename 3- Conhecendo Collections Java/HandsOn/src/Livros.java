public class Livros {
    private String autor;
    private String nomeLivro;
    private int publlicacaoPorAnos;

    public Livros(String autor, String nomeLivro, int publlicacaoPorAnos) {
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.publlicacaoPorAnos = publlicacaoPorAnos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getPubllicacaoPorAnos() {
        return publlicacaoPorAnos;
    }

    public void setPubllicacaoPorAnos(int publlicacaoPorAnos) {
        this.publlicacaoPorAnos = publlicacaoPorAnos;
    }
}
