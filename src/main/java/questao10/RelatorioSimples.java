package questao10;

public class RelatorioSimples extends RelatorioBancario {

    protected void imprimirCabecalho() {
        System.out.println("Banco XYZ");
    }

    protected void imprimirRodape() {
        System.out.println("(99) 9999-9999");
    }

    protected void imprimirDadosConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular() + " - Saldo: " + conta.getSaldo());
    }
}
