package aula07;

import java.util.Scanner;

public class Convidados {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Número maximo de convidados: 100 pessoas.");
        System.out.print("Digite o número de convidados: ");
        int convidados = sc.nextInt();

        do {
            if (convidados > 100) {
                System.out.println("Número inválido de convidados.");
                System.out.print("Digite outro número de convidados.");
                convidados = sc.nextInt();
            } 
        } while (convidados > 100);

        System.out.println("Reserva efetuada com sucesso.");
        System.out.println("Enviando e-mail com as instruções.");
        System.out.println("Sistema de Salão");
    }
}
