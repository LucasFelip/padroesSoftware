package questao4;

public class Revista implements Desconto {
    private String titulo;
    private String editora;
    private boolean digital;
    private boolean promocao;

    public Revista(String titulo, String editora, boolean digital, boolean promocao) {
        this.titulo = titulo;
        this.editora = editora;
        this.digital = digital;
        this.promocao = promocao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
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
                return 0.2; // 20% de desconto em revistas digitais na promoção
            } else {
                return 0.15; // 15% de desconto em revistas digitais fora da promoção
            }
        } else {
            if (promocao) {
                return 0.4; // 40% de desconto em revistas físicas na promoção
            } else {
                return 0.3; // 30% de desconto em revistas físicas fora da promoção
            }
        }
    }
}