/**
 * Nesse programa vamos utilizar o if para verificar se uma condição
 * é verdadeira, caso contrario, o programa deve executar as linhas da estrutura
 * else
 */
package aula05;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do candidato a Presidente da Replública: ");
        String nomeCandidato = sc.nextLine();

        System.out.print("Digite a idade do candidato: ");
        int idade = sc.nextInt();

        if (idade < 35){
            System.out.println("Pela constituição de 1988, o candidato deve " +
            "ter 35 anos completos para essa candidatura.");
        } else {
            System.out.println("Candidatura registrada com sucesso.");
        }

        System.out.println("Tribunal Superior Eleitoral");


        sc.close();
    }
}
