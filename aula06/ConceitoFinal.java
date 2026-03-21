/**
 * Nesse programa vamos solicitar ao usuário a entrada da média do aluno
 * e do números de faltas. Para ser aprovado o aluno precisa ter media supererior
 * ou igual a 7 e frequência superior ou igual a 75%. Se a média ficar entre 5
 * e 7 com frequência superior a 75%, o aluno fica de recuperação. E com média
 * inferior a 5 ou frequência inferior a 75%, o aluno está reprovado.
 */

package aula6;

import java.util.Scanner;

public class ConceitoFinal {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("***** Escola Senai Celso Charuri *****");
        System.out.println("=".repeat(50));
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a média do aluno no ano: ");
        double media = sc.nextDouble();
        System.out.print("Digite a porcentagem de frequência do aluno (apenas número): ");
        int frequencia = sc.nextInt();
        String conceito = "";

        if (media >= 7.0 && frequencia >= 75) {
            conceito = "APROVADO";
        } else if (media >= 5 && media < 7 && frequencia >= 75) {
            conceito = "RECUPERAÇÃO";
        } else {
            conceito = "REPROVADO";
        }

        System.out.println("=".repeat(50));
        System.out.println("**** Relatório Final *****");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média Anual: " + media);
        System.out.println("Frequência Anula: " + frequencia + "%");
        System.out.println("Conceito Final: " + conceito);
        System.out.println("=".repeat(50));
    }
}
