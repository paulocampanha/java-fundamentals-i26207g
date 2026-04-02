package aula07;
/**
 * Nesse programa vamos solicitar ao usuario para digitar um número para
 * impressão da tabuada
 */
import java.util.Scanner;

public class Tabuada {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(30));
        System.out.println("***** Sistema de Tabuada *****");
        System.out.println("-".repeat(30));        
        System.out.print("Digite o número para tabuada: ");
        int numero = sc.nextInt();
        System.out.println("-".repeat(30));
        System.out.println("   Tabuada do " + numero);
        System.out.println("-".repeat(30));

        int contador = 1;
        int limite = 10;
        while (contador <= limite) {
            int total = contador * numero;
            System.out.println(numero + " X " + contador + " = " + total);
            contador = contador + 1;
        }
        System.out.println("-".repeat(30));
        System.out.println("Fim da Tabuada");


        sc.close();
    }
}
