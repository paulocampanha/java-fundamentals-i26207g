/**
 * Nesse programa vamos usar o operador lógico "e" para verificar as 
 * notas de um aluno de 0 a 100 e classificar como Aprovado, Reprovado 
 * ou recuperação
 */
package aula05;
import java.util.Scanner;

public class OperadoresLogicos1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(50));
        System.out.println("Escola Senai Celso Charuri");
        System.out.println("=".repeat(50));
        System.out.print("Digite a 1ª nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a 2ª nota do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a 3ª nota do aluno: ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 50 && media <= 100){
            System.out.println("Aluno Aprovado");
        } else if (media >= 20 && media < 50) {
            System.out.println("Aluno de Recuperação");
        } else if (media >= 0 && media < 20){
            System.out.println("Aluno Reprovado");
        } else {
            System.out.println("Notas informadas inválidas.");
        }
        System.out.println("Média: " + String.format("%.1f", media));


        sc.close();
    }
}
