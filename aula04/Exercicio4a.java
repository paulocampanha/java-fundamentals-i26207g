/* Crie um programa para calcular a média de 4 notas. Crie 5
do tipo primitivo 'double' com o nome de nota1, nota2, nota3, 
nota4 e média. Coloque uma nota de 0 a 10 em cada variável de 
nota e calcule a média usando a fórmula:
media = (nota1 + nota2 + nota3 + nota4) / 4
Imprima a nota do aluno no console.
 */

public class Exercicio4a {

    public static void main(String args[]){
        double nota1 = 8.9;
        double nota2 = 7.3;
        double nota3 = 4.1;
        double nota4 = 5.2;

        double media = (nota1 + nota2 + nota3 + nota4 ) / 4;

        System.out.println("Média: " + media);
 
    }
    
}
