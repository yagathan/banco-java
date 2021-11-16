public class main {
    public static void main(String[] args){
        conta cc = new ContaCorrente();
        conta poupanca = new ContaPoupanca();
        cc.depositar(100);

        poupanca = new ContaPoupanca();
        cc.transferir(100,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
