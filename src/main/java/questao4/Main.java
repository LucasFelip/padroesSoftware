package questao4;

public class Main {
    public static void main(String[] args) {
        Jogos jogos = new Jogos("The Last of Us","Naught Dog",true,true);
        Revista revista = new Revista("Veja", "Abril", true, false);
        Livro livro = new Livro("Clean Code", "Alta Books", false, false);

        System.out.println("Jogo desconto: " + jogos.calcularDesconto());
        System.out.println("Revista desconto: " + revista.calcularDesconto());
        System.out.println("Livro desconto: " + livro.calcularDesconto());
    }
}
