/*
* Nesse programa vamos revisar o uso da estrura for
*/

import java.util.Scanner;

public class Revisao2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("* Escola Celso Charuri *");
        System.out.println("=".repeat(40));

        System.out.print("Quantas notas deseja lançar: ");
        int numeroNotas = sc.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= numeroNotas; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / numeroNotas;
        System.out.println("Media do aluno: " +
            String.format("%.1f", media)
        );



        sc.close();
    }
}
