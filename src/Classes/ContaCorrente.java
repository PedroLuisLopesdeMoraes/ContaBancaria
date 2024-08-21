package Classes;

import java.security.SecureRandom;

public class ContaCorrente extends Conta {
    private int contaCorrente;
    private double chequeEspecial;
    private double limiteCredito;

    public ContaCorrente(String cliente, double saldoConta) {
        super(cliente, saldoConta);
    }
    public int getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public void chequeEspecial (){
        if (getSaldoConta() <= 1500){
            chequeEspecial = getSaldoConta() * 0.1;
            System.out.println("Limite cheque especial: R$ " + chequeEspecial);
        } else {
            chequeEspecial = getSaldoConta() * 0.15;
            System.out.println("Limite cheque especial: R$ " + chequeEspecial);
        }
    }
    public void limiteCredito (){
        if (getSaldoConta() >= 2500){
            limiteCredito = getSaldoConta() * 0.3;
            System.out.println("Limite para empréstimo R$ " + limiteCredito);
        } else {
            limiteCredito = getSaldoConta() * 0.4;
            System.out.println("Limite para empréstimo> R$ " + limiteCredito);
        }
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        geraAgencia();
        chequeEspecial();
        limiteCredito();
        //nomeCliente();
        return "Cliente = " + //nomeCliente() +
                ", Agencia: " +getAgencia() +
                ", Saldo = R$ " + getSaldoConta() +
                ". Limite cheque especial: R$ " + chequeEspecial +
                ". Limite disponível para empréstimo: R$ " + limiteCredito;
    }
}
