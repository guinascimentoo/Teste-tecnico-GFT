public class ContaPoupança extends Pessoa{

    private Double saldo;
    private Double s;

    public ContaPoupança(Double numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getS() {
        return s;
    }

    public void setS(Double s) {
        this.s = s;
    }

    public void Saldo(Double saldo, Double s){
        saldo += saldo * 0.05;
    }
}