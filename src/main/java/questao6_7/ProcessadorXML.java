package questao6_7;

public class ProcessadorXML extends Processador {
    @Override
    public void processar(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.XML) {
            String xml = "<conta> <numero>" + conta.getTitular() + "</numero> <saldo>" + conta.getSaldo() + "</saldo></conta>";
            System.out.println(xml);
        } else {
            sucessor.processar(requisicao, conta);
        }
    }
}
