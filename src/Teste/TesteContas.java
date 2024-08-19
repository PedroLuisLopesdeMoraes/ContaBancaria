package Teste;

import Classes.Conta;

public class TesteContas {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setCliente("Rafael");
        c1.setNumConta(1234);
        c1.setSaldoConta(1000);

        System.out.println(c1.getSaldoConta());

        c1.deposita(100);

        System.out.println("novo saldo: " + c1.getSaldoConta());

        c1.saca(900);
        System.out.println("Saldo: " + c1.getSaldoConta());
    }
}