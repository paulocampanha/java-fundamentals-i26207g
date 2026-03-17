/**
 * Nesse programa vamos receber o nome de um aluno e suas notas no 
 * bimestre. Em seguida calcular a média do bimestre. Durante o bimestre
 * o aluno realizou 4 provas.
 */

import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String traco = "-";
        System.out.println(traco.repeat(50));
        System.out.println("| *** Escola Senai Celso Charuri ***");
        System.out.println(traco.repeat(50));
        System.out.println("| Systema de Lançamento de Notas");
        System.out.println(traco.repeat(50));

        System.out.print("| Nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("| 1ª nota do aluno: ");
        double nota1 = sc.nextDouble(); 

        System.out.print("| 2ª nota do aluno: ");
        double nota2 = sc.nextDouble();

        System.out.print("| 3ª nota do aluno: ");
        double nota3 = sc.nextDouble();

        System.out.print("| 4ª nota do aluno: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(traco.repeat(50));
        System.out.println("| O aluno " + nomeAluno + " obteve a média " + 
            String.format("%.2f", media) + ".");
        System.out.println(traco.repeat(50));
        sc.close();
    }
}
