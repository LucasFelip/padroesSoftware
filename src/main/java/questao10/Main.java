package questao10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = criarConta();

        // gerar relatório simples
        RelatorioBancario relatorioSimples = new RelatorioSimples();
        relatorioSimples.gerarRelatorio(contas);
        System.out.println("\n---------------------------------------------\n");
        // gerar relatório complexo
        RelatorioBancario relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.gerarRelatorio(contas);
    }

    public static List<Conta> criarConta(){
        String[][] dadosContas = {
                { "1000.0", "João da Silva", "1234-5", "001" },
                { "2500.0", "Maria Souza", "5678-9", "002" },
                { "5000.0", "Pedro Santos", "9876-5", "003" }
        };

        List<Conta> contas = new ArrayList<>();
        for (String[] dadosConta : dadosContas) {
            double saldo = Double.parseDouble(dadosConta[0]);
            String titular = dadosConta[1];
            String numero = dadosConta[2];
            String agencia = dadosConta[3];
            Conta conta = new Conta(saldo, titular, numero, agencia);
            contas.add(conta);
        }

        return contas;
    }
}
