package questao5;

public class Nota100Handler extends Handler{
    public Nota100Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 100;
    }
}
