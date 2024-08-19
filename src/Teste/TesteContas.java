package Teste;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

import java.security.SecureRandom;

public class TesteContas {
    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca();
        SecureRandom secureRandom = new SecureRandom();
        int numeroConta = secureRandom.nextInt(90000) + 10000; // Gera número entre 10000 e 99999

        c1.setContaPoupanca(numeroConta);
        c1.setCliente("Rafael");
        c1.deposita(1000);

        System.out.println(c1.getSaldoConta());

        c1.rendimentoPoupanca();



    }
}