package questao5;

public class Nota20Handler extends Handler {
    public Nota20Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 20;
    }
}
