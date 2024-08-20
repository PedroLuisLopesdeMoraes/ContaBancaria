package Teste;

import Classes.ContaCorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeradorDeContaCorrente extends ContaCorrente {
    public static void main(String[] args) {
        List<Object> contasCorrentes = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a quantidade contas a criar: ");
        int qtdContas = leitura.nextInt();


        for (int i = 0; i < qtdContas; i++) {

            System.out.println("Nome do cliente: ");
            String cliente = leitura.next();

            ContaCorrente contaCliente = new ContaCorrente();

            contasCorrentes.add(contaCliente);


        }
        System.out.println(contasCorrentes);

    }
}
