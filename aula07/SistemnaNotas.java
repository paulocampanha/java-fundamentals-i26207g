/**
 * Nesse programa vamos receber as notas de um professor e calcular a média
 * do aluno e imprimir o conceito final. Não existe uma quantidade exata de
 * notas. Cada professor determina quanbtas avaliaçãoes deseja fazer.
 */

package aula07;
import java.util.Scanner;

public class SistemnaNotas {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nomeAluno = sc.nextLine();

        int numeroNotas = 0;
        double somaNotas = 0;

        while (true) {
            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            somaNotas += nota;     // equivalente a somaNotas = somaNotas + nota
            numeroNotas++;
            
            System.out.print("Deseja lançar outra nota (S/N)? ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("N")){
                break;
            }
        }

        double media = somaNotas / numeroNotas;

        if (media >= 6) {
            System.out.println("O aluno " + nomeAluno + " foi APROVADO!");
            System.out.println("Sua média foi " + String.format("%.1f", media));
        } else if (media >= 3 && media < 6) {
            System.out.println("O aluno " + nomeAluno + " ficou de RECUPERAÇÃO!");
            System.out.println("Sua média foi " + String.format("%.1f", media));
        } else {
            System.out.println("O aluno " + nomeAluno + " foi REPROVADO!");
            System.out.println("Sua media foi " + String.format("%.1f", media));
        }

        
    }
}
