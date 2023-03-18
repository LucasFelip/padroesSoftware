package questao6_7;

public abstract class Processador {
    protected Processador sucessor;

    public void setSucessor(Processador sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void processar(Requisicao requisicao, Conta conta);
}
