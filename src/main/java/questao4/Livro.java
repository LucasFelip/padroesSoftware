package questao4;

public class Livro implements Desconto {
    private String titulo;
    private String autor;
    private boolean digital;
    private boolean promocao;

    public Livro(String titulo, String autor, boolean digital, boolean promocao) {
        this.titulo = titulo;
        this.autor = autor;
        this.digital = digital;
        this.promocao = promocao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDigital() {
        return digital;
    }

    public boolean isPromocao() {
        return promocao;
    }

    @Override
    public double calcularDesconto() {
        if (digital) {
            if (promocao) {
                return 0.2; // 20% de desconto em livros digitais na promoção
            } else {
                return 0.15; // 15% de desconto em livros digitais fora da promoção
            }
        } else {
            if (promocao) {
                return 0.4; // 40% de desconto em livros físicos na promoção
            } else {
                return 0.3; // 30% de desconto em livros físicos fora da promoção
            }
        }
    }
}
