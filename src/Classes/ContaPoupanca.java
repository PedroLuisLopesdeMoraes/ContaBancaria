package Classes;

public class ContaPoupanca extends Conta{
    private int contaPoupanca;
    private double rendimento;

    public ContaPoupanca(String cliente, double saldoConta) {
        super(cliente, saldoConta);
    }


    public int getContaPoupanca() {
        return contaPoupanca;
    }
    public void setContaPoupanca(int contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public void rendimentoPoupanca (){
        double selic = 0.05;
        if (selic >= 8.5){
            rendimento = getSaldoConta() * 0.5;
            System.out.println("Rendimento mensal médio: R$ " + rendimento);
        } else {
            rendimento = (getSaldoConta() * (selic * 0.7));
            System.out.println("Rendimento mensal médio: R$ " + rendimento);
        }

    }
    @Override
    public String toString() {
        return "Cliente = " + getCliente() +
                ", Saldo = R$ " + getSaldoConta() ;
    }
}
