/**
 * Nesse programa vamos solicitar o cupom do cliente e informar 
 * o valor do desconto. Cupões FESTA10 e TECH10 terão desconto de 5%. 
 * Cupões BEST10 e JOSE19, terão desconto de 10%. 
 * Sem cupom, sem desconto.
 */

package aula06;
import java.util.Scanner;

public class Restaurante {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("*** Restaurante São José *****");
        System.out.println("=".repeat(50));
        System.out.println("Menu de Cumpom");
        System.out.println("0 - SEM CUPOM");
        System.out.println("1 - FESTA10");
        System.out.println("2 - TECH10");
        System.out.println("3 - BEST10");
        System.out.println("4 - JOSE19");
        System.out.println("=".repeat(50));

        System.out.print("Digite o valor total: ");
        double valorTotal = sc.nextDouble();
        
        System.out.print("Digite o número do cupom: ");
        int cupom = sc.nextInt();
        double desconto = 0.0;
        double valorPagar = 0.0;

        if (cupom == 1 || cupom == 2){
            desconto = valorTotal * 0.05;
        } else if (cupom == 3 || cupom == 4) {
            desconto = valorTotal * 0.1;
        } else {
            desconto = 0.0;
        }

        valorPagar = valorTotal - desconto;
        System.out.println("=".repeat(50));
        System.out.println("Valor a Pagar: R$ " + 
            String.format("%,.2f", valorPagar));

        System.out.println("=".repeat(50));

    }
}
