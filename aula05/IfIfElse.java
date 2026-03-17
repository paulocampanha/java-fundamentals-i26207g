/**
 * Nesse programa vamos usar ifs internos para determinar se uma pessoa
 * deve se alistar no exercíto ou não.
 */
package aula05;
import java.util.Scanner;

public class IfIfElse {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite seu sexo (M)masculino ou (F)feminino: ");
        String sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("M")){
            if (idade == 18) {
                System.out.println("Acesse o Portal GOV para fazer " +
                "o Alistamento Militar");
            } else {
                System.out.println("Você não está apto para o serviço militar.");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Pessoa o sexo Feminino não são obrigadas a fazer" +
                " o alistamento militar");
        } else {
            System.out.println("Sexo informado inválido");
        }
    }
}
