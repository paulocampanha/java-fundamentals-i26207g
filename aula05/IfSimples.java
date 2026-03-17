package aula05;
import java.util.Scanner;

public class IfSimples {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("* Verificação de Idade para Acesso *");
        System.out.println("=".repeat(50));
        System.out.print("Digite a idade do convidado: ");
        int idade = sc.nextInt();
        System.out.println("=".repeat(50));

        if (idade >= 18) {
            System.out.println("Idade Verificada: " + idade + " anos.");
            System.out.println("Acesso Permitido.");
        }

        if (idade < 18) {
            System.out.println("Idade Verificada: " + idade + " anos.");
            System.out.println("Acesso Negado.");
        }

        System.out.println("=".repeat(50));
        System.out.println("Sistema Lotus");
        sc.close();
    }
}
