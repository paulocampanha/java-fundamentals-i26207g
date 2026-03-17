/**
 * A empresa de eletricistas Wyane atende apenas a cidade de São Paulo em todas 
 * as regiôes. A empresa possui 5 polos para facilitar o atendimento por região
 * (Sul, Norte, Leste, Oeste e Centro). 
 * Faça um programa que solicita o nome da cidade em que o cliente precisa do 
 * serviço e em qual região ele se encontra. Se o cliente for de SP, imprima
 * qual polo que deve atendê-lo de acordo com a sua região. Por exemplo:
 * Cidade: SP
 * Região: Sul
 * "Chamado enviado para o Polo da Região SUL."
 * Se o cliente não for da cidade de São Paulo, imprima a mensagem:
 * Nossa empresa só atende na cidade de São Paulo. 
 */

package aula05;
import java.util.Scanner;

public class ExercicioIfIfElse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua cidade (SP, GU, OS): ");
        String cidade = sc.nextLine();
        System.out.print("Digite sua Região: ");
        String regiao = sc.nextLine();

        if (cidade.equalsIgnoreCase("SP")) {
            if (regiao.equalsIgnoreCase("Sul")){
                System.out.println("Chamado enviado para o Polo da Região SUL.");
            } else if (regiao.equalsIgnoreCase("Norte")){
                System.out.println("Chamado enviado para o Polo da Região NORTE.");
            
            } else if (regiao.equalsIgnoreCase("Leste")){
                System.out.println("Chamado enviado para o Polo da Região LESTE.");
            
            } else if (regiao.equalsIgnoreCase("Oeste")){
                System.out.println("Chamado enviado para o Polo da Região OESTE.");
            
            } else if (regiao.equalsIgnoreCase("Centro")){
                System.out.println("Chamado enviado para o Polo da Região CENTRO.");
            }
        } else {
            System.out.println("Nossa empresa só atende na cidade de São Paulo.")
        }
        


        sc.close();
    }
}
