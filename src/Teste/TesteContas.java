package Teste;

import Classes.Conta;
import Classes.ContaCorrente;

import java.security.SecureRandom;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        SecureRandom secureRandom = new SecureRandom();
        int numeroConta = secureRandom.nextInt(90000) + 10000;

        c1.setContaCorrente(numeroConta);
        c1.setCliente("Rafael");
        c1.deposita(1000);

        System.out.println(c1.getSaldoConta());

        c1.chequeEspecial();
        c1.limiteCredito();
        System.out.println(c1.getContaCorrente());
        //numeroConta);
    }
}