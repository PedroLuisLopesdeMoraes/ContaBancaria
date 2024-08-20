package Classes;

import java.security.SecureRandom;

public class Conta {
    private String cliente;
    private int AGENCIA;
    private double saldoConta;


    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getAGENCIA() {
        return AGENCIA;
    }
    public void setAGENCIA(int AGENCIA) {
        this.AGENCIA = AGENCIA;
    }
    public double getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void deposita (double valor){
        saldoConta += valor;
        System.out.println("Novo saldo: R$ " + saldoConta);
    }

    public void saca (double valor){
        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente");
        }else {
            this.saldoConta -= valor;
            System.out.println("Novo saldo: R$ " + saldoConta);
        }
    }

    public void geraAgencia() {
        SecureRandom secureRandom = new SecureRandom();
        int numAgencia = secureRandom.nextInt(90) + 10;
        System.out.println("Número da agência: " + numAgencia);
    }
}
