package Classes;

public class Conta {
    private String cliente;
    private int numConta;
    private double saldoConta;


    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void deposita (double valor){
        saldoConta = valor + saldoConta;
        System.out.println("Novo saldo: " + saldoConta);
    }

    public void saca (double valor){
        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente");
        }else {
            this.saldoConta = saldoConta - valor;
            System.out.println("Novo saldo: " + saldoConta);
        }
    }

}
