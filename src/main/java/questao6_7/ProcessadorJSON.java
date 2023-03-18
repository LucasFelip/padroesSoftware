package questao6_7;

public class ProcessadorJSON extends Processador {
    @Override
    public void processar(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.JSON) {
            String json = "{ numero: " + conta.getTitular() + ", saldo:" + conta.getSaldo() + " }";
            System.out.println(json);
        } else {
            sucessor.processar(requisicao, conta);
        }
    }
}
