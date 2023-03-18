package questao5;

public class Nota50Handler extends Handler {
    public Nota50Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 50;
    }
}
