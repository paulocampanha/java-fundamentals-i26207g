/**
 * Nesse programa vamos fazer o teste lógico usando uma expressão
 * matemática. Nosso programa deve receber um número e verifar se o
 * mesmo é par ou impar
 */

package aula05;
import java.util.Scanner;

public class IfElse2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
        System.out.println("=".repeat(50));


        sc.close();
    }
}
