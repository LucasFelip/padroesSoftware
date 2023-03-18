package questao5;

public class CaixaEletronico {
    private Handler primeiroHandler;

    public CaixaEletronico() {
        Nota100Handler nota100Handler = new Nota100Handler(null);
        Nota50Handler nota50Handler = new Nota50Handler(nota100Handler);
        Nota20Handler nota20Handler = new Nota20Handler(nota50Handler);
        Nota10Handler nota10Handler = new Nota10Handler(nota20Handler);
        Nota5Handler nota5Handler = new Nota5Handler(nota10Handler);
        primeiroHandler = nota5Handler;
    }

    public void sacar(int valor) {
        System.out.printf("Saque de R$ %d\n", valor);
        primeiroHandler = new Nota100Handler(new Nota50Handler(new Nota20Handler(new Nota10Handler(new Nota5Handler(null)))));
        primeiroHandler.handle(valor);
    }
}
