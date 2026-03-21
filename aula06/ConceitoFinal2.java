/**
 * Nesse programa vamos solicitar ao usuário 5 notas, calcular
 * a média das notas e imprimir o conceito final do aluno.
 */

package aula06;
import java.util.Scanner;
public class ConceitoFinal2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double nota = 0.0;
        double soma = 0.0;
        double media = 0.0;
        int contador = 1;

        System.out.print("Digite a nome do aluno: ");
        String nomeAluno = sc.nextLine();

        while (contador <= 5) {
            System.out.print("Digite a "+ contador + "ª nota: ");
            nota = sc.nextDouble();
            soma += nota;
            contador++;
        }
        
        media = soma / 5;

        if (media >= 6) {
            System.out.println("O aluno " + nomeAluno + 
            " obteve a média" + String.format("%.1f", media));
            System.out.println("Resultado: APROVADO");
        } else if (media >=3 && media < 6) {
            System.out.println("O aluno " + nomeAluno +
            " obteve a média " + String.format("%.1f", media));
            System.out.println("Resultado: RECUPERAÇÃO");
        } else {
            System.out.println("O aluno " + nomeAluno + 
            " obteve a média " + String.format("%.1f", media));
            System.out.println("Resultado: REPROVADO");
        }



        sc.close();
    }
}
