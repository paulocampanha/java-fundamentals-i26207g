/**
 * Elabore um programa java de uma calculadora para dois números.
 * Sua calculadora deve solicitar ao usuário um número, a 
 * operação matemática (+, -, * ou /) e o outro número. 
 * Usando o switch case, imprima o resultado da operação
 * desejada pelo usuário de acordo com a operação escolhida.
 * Atenção: Se o segundo número for zero e a operação for 
 * divisão, não é possível fazer a operação. Apenas informe o
 * erro ao usuário.
 */

package aula6;
import java.util.Scanner;
public class ExercicioCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Calculadora Simples ***");
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite a operação (+, -, * ou /): ");
        String operacao = sc.next();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        int resultado = 0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                
                if (num2 == 0){
                    System.out.println("Operação inválida.");
                    System.out.println("Naõ é possivel dividir um número por zero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
        
            default:
                System.out.println("Operação inválida.");
                break;
        }
        

        sc.close();
        
    }
    
}
