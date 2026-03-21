/**
 * Desenvolva um programa em Java em que o usuário deve digitar
 * o número do dia da semana que deseja trabalhar.
 * (exemplo: 1 para Domingo, 2 para Segunda-feira, 3 para 
 * Terça-feira, etc.). 
 * Seu programa deve verificar se o dia da semana é 1 ou 7 e 
 * imprimir: FIM DE SEMANA, se o dia for 2 ou 3, INICIO DA SEMANA 
 * e se for 4 ou 5 ou 6, RESTO DA SEMANA. Inclua uma mensagem de 
 * NÚMERO INVÁLIDO, caso o usuário digite um número diferente
 * de 1 a 7.
 */

package aula6;
import java.util.Scanner;

public class ExercicioOperadorLogicoOu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Dias para Seleção ***");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");
        System.out.print("Digite o número do dia da semana quedeseja trabalhar: ");
        int dia = sc.nextInt();

        if (dia == 1 || dia == 7) {
            System.out.println("FIM DE SEMANA");
        } else if (dia == 2 || dia == 3){
            System.out.println("INICIO DA SEMANA");
        } else if (dia == 4 || dia == 5 || dia == 6) {
            System.out.println("RESTO DA SEMANA");
        } else {
            System.out.println("NÚMERO INVÁLIDO");
        }
    }
    
}
