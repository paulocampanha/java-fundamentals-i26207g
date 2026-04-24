/* 
* REvisao da estrutura de repetição while
*/

import java.util.Scanner;

public class Revisao {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        double somaNotas = 0;
        int numeroNotas = 0;

        while (true){
            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            somaNotas += nota;   //  equivalente a somaNotas = somaNotas + nota
            numeroNotas += 1;
            System.out.print("Deseja lançar outra nota S/N: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
        double media = somaNotas / numeroNotas;
        System.out.println("=".repeat(40));
        if (media >= 6){
            System.out.println("O aluno " + nomeAluno + 
            " foi APROVADO!");
            System.out.println("Sua média foi " + 
            String.format("%.1f", media));
        } else if (media >= 3 && media < 6) {
            System.out.println("O aluno " + nomeAluno + 
            " ficou de RECUPERAÇÃO!");
            System.out.println("Sua média foi " + 
            String.format("%.1f", media));
        } else {
            System.out.println("O aluno " + nomeAluno +
            " foi REPROVADO!");
            System.out.println("Sua média foi " + 
            String.format("%.1f", media));
        }
        System.out.println("=".repeat(40));
        System.out.println("Escola Celaso Charuri");
        sc.close();

    }
}

