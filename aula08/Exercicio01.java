/**
 * Crie um programa em java com uma array que deve receber o nome
 * de cinco frutas favoritas do usuário. Depois que o usuário
 * digitar suas frutas favoritas, imprima todas elas na mesma linha.
 */

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] frutas = new String[5];

        System.out.println("Quais suas frutas favoritas");
        System.out.println("Digite cinco delas.");

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Digite sua fruta favorita: ");
            frutas[i] = sc.nextLine();
        }

        for (int i = 0; i < frutas.length; i++){
            if (i < (frutas.length - 1)) {
                System.out.print(frutas[i] + ", ");
            } else {
                System.out.print(frutas[i] + ". ");
            }
        }



        sc.close();
    }
}
