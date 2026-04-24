
/**
 * Nesse programa vamos recriar o sistema de notas usando array
 */

import java.util.Scanner;

public class Array02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("* Escola Celso Charuri *");
        System.out.println("=".repeat(40));
        
        System.out.print("Quantas notas deseja lançar: ");
        int numeroNotas = sc.nextInt();

        double[] notas = new double[numeroNotas];

        sc.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = sc.nextDouble();
        }

        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;
        // double media = somaNotas / numeroNotas;

        System.out.println("Nome do aluno: " + nomeAluno);
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota: " + notas[i]);
        }
        
        System.out.println("Média: " + media);
        System.out.println("=".repeat(40));
        sc.close();
    }
}
