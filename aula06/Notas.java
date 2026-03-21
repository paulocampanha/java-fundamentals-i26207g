/**
 * Nesse programa vamos solicitar as notas de um aluno 
 * atribuidas por letras (A, B, C, D e E), sendo que as letras A e
 * B aprovam o aluno, a letra C, coloca o aluno em recuperação
 * e as letras D e E reprovam o aluno.
 */
package aula6;
import java.util.Scanner;

public class Notas {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Escola TechVision ***");
        System.out.print("Digite a nota do aluno: ");
        String nota = sc.nextLine();
        nota = nota.toUpperCase();

        switch (nota) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
                System.out.println("Aluno de Recuperação!");
                break;
            case "D":
            case "E":
                System.out.println("Aluno Reprovado!");
                break;
            default:
                System.out.println("Nota digitada inválida.");
        }

        sc.close();
    }
}
