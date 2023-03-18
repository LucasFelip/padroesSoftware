package questao5;

public abstract class Handler {
    private Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(int valor) {
        int qtdNotas = valor / getValorNota();
        if (qtdNotas > 0) {
            System.out.printf("%d nota(s) de R$ %d\n", qtdNotas, getValorNota());
        }
        int valorResto = valor % getValorNota();
        if (valorResto > 0 && nextHandler != null) {
            nextHandler.handle(valorResto);
        }
    }

    protected abstract int getValorNota();
}
