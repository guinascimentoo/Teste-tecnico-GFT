import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa(15.5, "Guilherme", 500.0);
        ContaCorrente contaCorrente = new ContaCorrente(15.5, "Guilherme", 500.0);
        ContaPoupança contaPoupança = new ContaPoupança(15.5, "Guilherme", 500.0);

    }
}