package questao6_7;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(2300, "João");
        Requisicao requisicao = new Requisicao(Formato.PORCENTO);

        sucessao(requisicao, conta);
    }

    public static void sucessao(Requisicao requisicao, Conta conta){
        Processador processadorXML = new ProcessadorXML();
        Processador processadorCSV = new ProcessadorCSV();
        Processador processadorJSON = new ProcessadorJSON();

        processadorJSON.setSucessor(processadorXML);
        processadorXML.setSucessor(processadorCSV);
        processadorCSV.setSucessor(new ProcessadorPORCENTO());

        processadorJSON.processar(requisicao, conta);
    }
}
