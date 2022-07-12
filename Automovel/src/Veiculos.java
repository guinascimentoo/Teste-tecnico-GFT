import java.util.Scanner;

public class Veiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Esportivo esportivo = new Esportivo();
        Caminhao caminhao = new Caminhao();

        System.out.println("Digite o tipo do veiculo:");
        System.out.println("1 para Esportivo ou 2 para Caminhao");
        int escolha = sc.nextInt();

        if(escolha == 1){
            System.out.println("O combustivel do esportivo é " + esportivo.getGasolina());
        }else if(escolha == 2){
            System.out.println("O combustivel do caminha é " + caminhao.getDiesel());
        }
        sc.close();
    }
}