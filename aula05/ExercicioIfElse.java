/**
 * Uma empresa no centro de Guarulhos, está contratando programadores na
 * linguagem Java. AS vagas são para a modalidade presencial ou Home Office.
 * Os candidados que tiverem residência em Guarulhos, serão contratados para
 * a modalidade presencial, os candidatos que tiverem residência em outras
 * cidades, serão contratos para a modalidade Home Office. 
 * Faça um programa que solicita o nome e a cidade onde o candidato mora. Se
 * a cidade for igual a Guarulhos imprima na tela: 
 * [nome]. SUA CONTRATAÇÃO SERÁ PARA A MODALIDADE PRESENCIAL.
 * Caso contrário, imprima na tela:
 * [nome]. SUA CONTRATAÇÃO SERÁ PARA A MODALIDADE HOME OFFICE.
 * Após as mesnagens imprima uma linha tracejada e o nome da consultoria
 * de RH: (WAYNE RECURSOS HUMANOS)
 */

package aula05;
import java.util.Scanner;

public class ExercicioIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a cidade onde reside: ");
        String cidade = sc.nextLine();

        if (cidade.equalsIgnoreCase("GUARULHOS")) {
            System.out.println(nome + ". SUA CONTRATAÇÃO SERÁ PARA A MODALIDADE PRESENCIAL.");
        } else {
            System.out.println(nome + ". SUA CONTRATAÇÃO SERÁ PARA A MODALIDADE HOME OFFICE.");
        }

        System.out.println("WAYNE Recursos Humanos");

        sc.close();
    }
}
