package Classes;

public class ContaCorrente extends Conta {
    private int contaCorrente;
    private double chequeEspecial;
    private double limiteCredito;

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
            System.out.println("Limite para empréstimo> R$ " + limiteCredito);
        } else {
            limiteCredito = getSaldoConta() * 0.4;
            System.out.println("Limite para empréstimo> R$ " + limiteCredito);
        }
    }
}
