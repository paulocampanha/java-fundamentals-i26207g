/**
 * Uma escola utiliza o termo menção para atribuir notas a 
 * seus alunos. Os alunos podem receber como menção os valores:
 * D - Desenvolvido
 * ED - Em Desenvolvimento
 * ND - Não Desenvolvido
 * Elabore um programa em java que solicita ao professor a menção
 * do aluno, de acordo com a tabela e imprima os conceitos:
 * D - Aluno Aprovado
 * ED - Aluno de Recuperação
 * ND - Aluno Reprovado.
 */

package aula6;
import java.util.Scanner;

public class ExercicioSwitchCase {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a menção do aluno: ");
        String mencao = sc.nextLine();
        mencao = mencao.toUpperCase();
        switch (mencao){
            case "D":
                System.out.println("Aluno Aprovado");
                break;
            case "ED":
                System.out.println("Aluno de Recuperação");
                break;
            case "ND":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Menção Inválida");

        }

        sc.close();
    }
}
