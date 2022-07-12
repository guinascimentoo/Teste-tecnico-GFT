import java.util.Locale;
import java.util.Scanner;

public class IdadePeso {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão inseridas ?");
        int pessoas = sc.nextInt();
        double[] vetor = new double[pessoas];

        for(int i=0; i<vetor.length; i++){
            sc.nextLine();
            System.out.println("Digite as informações da " + (i+1) + "#" + " pessoa");
            System.out.print("Digite o idade: ");
            double idade = sc.nextDouble();
            System.out.print("Digite o peso: ");
            vetor[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for(int i=0; i<vetor.length; i++){
            soma += vetor[i];
        }
        double media = soma / pessoas;
        System.out.printf("A média do peso das pessoas é: %.1f%n", media);
    }
}