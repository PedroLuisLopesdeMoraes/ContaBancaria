package Teste;

import Classes.ContaCorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeradorDeContaCorrente extends ContaCorrente {


    public GeradorDeContaCorrente(String cliente, double saldoConta) {
        super(cliente, saldoConta);
    }

    public static void main(String[] args) {
        List<Object> contasCorrentes = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        while (true){
            leitura.nextLine();
            System.out.println("Nome do cliente (ou sair para encerrar): ");
            String cliente = leitura.nextLine();

            if (cliente.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Deposito inicial: ");
            double saldo = leitura.nextDouble();

            ContaCorrente contaCliente = new ContaCorrente(cliente, saldo);
            contasCorrentes.add(contaCliente);

        }
        //System.out.println(contasCorrentes);
        for (Object contas : contasCorrentes){
            System.out.println(contas);
        }
    }
}
