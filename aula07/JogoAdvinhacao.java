/**
 * Nesse programa vamos criar um jogo em que o usuário terá que adivinhar
 * um número secreto sorteado pelo computador. Para esse jogo, o usuário terá
 * três chances, em cada erro, o programa dá dicas para ajudar o jogador.
 */
package aula07;
import java.util.Scanner;
import java.util.Random;

public class JogoAdvinhacao {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("=".repeat(50));
        System.out.println("*****  Bem-vindo ao jogo de Adivinhação  *****");
        System.out.println("=".repeat(50));
        System.out.println("- Você tem 3 tentativas para adivinhar um número entre 1 e 10.");
        System.out.println("- Esse número será sorteado pelo computador");
        System.out.println("BOA SORTE !!!");
        
        int tentativas = 3;
        int numeroSecreto = rd.nextInt(10) + 1;
        int palpite;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            palpite = sc.nextInt();
            if (palpite == numeroSecreto) {
                System.out.println("=".repeat(50));
                System.out.println("PARABÉNS!!!");
                System.out.println("Você acertou o número secreto.");
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("Seu palpite é maior do que o número sorteado.");
            } else {
                System.out.println("Seu palpite é menor do que o número sorteado.");
            }
            tentativas--;

            if (tentativas > 0){
                System.out.println("Tente novamente...");
            }
            
        } while (tentativas > 0);
        System.out.println("=".repeat(50));
        
        if (tentativas == 0){
            System.out.println("PERDEU!!!");
            System.out.println("Você não acertou o número sorteado.");
            System.out.println("O número sorteado foi " + numeroSecreto);
        }

        sc.close();
    }
}
