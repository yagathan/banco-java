public interface interfaceConta {

        void sacar(double valor);

        void depositar(double valor);

        void transferir(double valor, conta contaDestino);
        
        void imprimirExtrato();
    }

