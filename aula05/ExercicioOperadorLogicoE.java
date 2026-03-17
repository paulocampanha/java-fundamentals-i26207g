/**
 * A escolinha de futebol Leões da Bola possui três programas de aluno.
 * Leõezinhos (de 5 a 7 anos), Craques da Bola (de 8 a 12 anos) e
 * Elite do Futebol (de 13 a 17 anos).
 * Faça um programa que recebe a idade do aluno e imprime em qual programa
 * ele deve ser cadastrado.
 * Outras idades informadas deve ser impresso: 
 * Idade inválida para nossos programas
 */

package aula05;
import java.util.Scanner;

public class ExercicioOperadorLogicoE {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Programa Leõezinhos");
        } else if (idade >= 8 && idade <= 12){
            System.out.println("Programa Craques do Futuro");
        } else if (idade >= 13 && idade <= 17){
            System.out.println("Programa Elite do Futebol");
        } else {
            System.out.println("Idade inválida para nossos programas");
        }
    }
}
