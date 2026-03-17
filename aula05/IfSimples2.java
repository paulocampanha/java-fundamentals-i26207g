/**
 * Nesse programa vamos calcular a idade de uma pessoa a partir do ano
 * informado pelo usuário
 */
package aula05;

import java.util.Scanner;
import java.time.LocalDate;

public class IfSimples2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.print("Você já fez aniversário esse ano (S/N)? ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("N")){
            idade -= 1;
        }

        System.out.println("Sua idade é " + idade);

    }
}
