import java.util.Scanner;

public class ProgramaDoacaoSangue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a sua idade?: ");
        int idade = sc.nextInt();

        if(idade >= 18 && idade <= 67){
            System.out.println("Você tem idade para doar sangue");
        }else{
            System.out.println("Vão não tem idade para doar sangue");
        }
        sc.close();
    }
}