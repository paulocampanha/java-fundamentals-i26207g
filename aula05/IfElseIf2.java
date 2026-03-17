/**
 * Nesse programa vamos usar a estrutura if, else if para verificar se
 * o aluno foi aprovado ou não de acordo com a nota registrada pelas
 * letras: D (Desenvolvido), ED(Em Desenvolvimento) e ND (Não Desenvolvido)
 */
package aula05;
import java.util.Scanner;

public class IfElseIf2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Digite a nota do aluno (D, ED ou ND): ");
        String nota = sc.nextLine();

        if (nota.equalsIgnoreCase("D")){
            System.out.println(nomeAluno + " está APROVADO nessa disciplina.");
        } else if (nota.equalsIgnoreCase("ED")) {
            System.out.println(nomeAluno + " está de RECUPERAÇÃO nessa disciplina.");
        } else if (nota.equalsIgnoreCase("ND")) {
            System.out.println(nomeAluno + " está REPROVADO nessa disciplina.");
        } else {
            System.out.println("Nota digitada inválida");
        }

        System.out.println("=".repeat(50));
        System.out.println("*** Sistema Educacional Plutão ***");
        



        sc.close();
    }
}
