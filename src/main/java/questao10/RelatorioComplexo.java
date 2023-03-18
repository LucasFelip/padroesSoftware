package questao10;

import java.time.LocalDate;

public class RelatorioComplexo extends RelatorioBancario {

    protected void imprimirCabecalho() {
        System.out.println("Banco XYZ - Av. Paulista, 123 - (99) 9999-9999");
        System.out.println("Data: " + LocalDate.now());
    }

    protected void imprimirRodape() {
        System.out.println("E-mail: contato@bancoxyz.com.br");
    }

    protected void imprimirDadosConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular() + " - Agência: " + conta.getAgencia() +
                " - Número da Conta: " + conta.getNumero() + " - Saldo: " + conta.getSaldo());
    }
}
