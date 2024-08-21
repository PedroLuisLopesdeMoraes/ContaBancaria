package Classes;

import java.security.SecureRandom;
import java.math.*;

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
            chequeEspecial = Math.round(getSaldoConta() * 0.1 * 100) / 100;
            //System.out.println("Limite cheque especial: R$ " + chequeEspecial);
        } else {
            chequeEspecial = Math.round(getSaldoConta() * 0.15 * 100) / 100;
            //System.out.println("Limite cheque especial: R$ " + chequeEspecial);
        }
    }
    public void limiteCredito (){
        if (getSaldoConta() >= 2500){
            limiteCredito = Math.round(getSaldoConta() * 0.3 * 100) / 100;
            //System.out.println("Limite para empréstimo R$ " + limiteCredito);
        } else {
            limiteCredito = Math.round(getSaldoConta() * 0.4 * 100) / 100;
            //System.out.println("Limite para empréstimo> R$ " + limiteCredito);
        }
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        geraAgencia();
        chequeEspecial();
        limiteCredito();

        return "Cliente = " + getCliente() +
                ", Agencia: " +getAgencia() +
                ", Saldo = R$ " + getSaldoConta() +
                ". Limite cheque especial: R$ " + chequeEspecial +
                ". Limite disponível para empréstimo: R$ " + limiteCredito;
    }
}
