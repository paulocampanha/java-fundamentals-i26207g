/**
 * Crie um programa para receber do usuário um Array com 6 números 
 * decimais. Calcule e imprima o total desse números.
 */
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[6];
        System.out.println("Digite seis número para somar.");
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i+1) + "º número:");
            numeros[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos numeros informados e: " + soma);

        sc.close();
    }
}
