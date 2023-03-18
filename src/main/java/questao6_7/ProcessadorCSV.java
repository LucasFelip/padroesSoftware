package questao6_7;

public class ProcessadorCSV extends Processador {
    @Override
    public void processar(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.CSV) {
            String csv = conta.getTitular() + "%" + conta.getSaldo();
            System.out.println(csv);
        } else {
            sucessor.processar(requisicao, conta);
        }
    }
}
