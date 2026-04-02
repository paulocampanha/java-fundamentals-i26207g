package aula07;
import java.util.Scanner;

public class LerNumeros {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número." + 
                 "(Digite um número negativo para parar)");
            numero = sc.nextInt();
            System.out.println("Você digitou o número: " + numero);
        } while (numero >= 0);
        System.out.println("=".repeat(40));
    }
}
