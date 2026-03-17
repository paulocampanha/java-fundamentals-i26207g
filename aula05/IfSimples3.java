/**
 * Nesse programa vamos calcular o valor de aumento de salario, 
 * caso o salario seja menor que o salario mínimo. Em seguida 
 * imprimir o salario 
 */
package aula05;

import java.util.Scanner;

public class IfSimples3 {

    public static void main(String args[]){

        System.out.println("=".repeat(50));
        System.out.println("*** Sistema de Folha de Pagemento ***");
        System.out.println("=".repeat(50));
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1621.00;

        System.out.print("Digite o salario do funcionário: ");
        double salario = sc.nextDouble();

        if (salario < salarioMinimo) {
            double valorAumento = salario * 0.15; //Aumento de 15%
            salario += valorAumento;  // Equivalente a salario = salario + valorAumento
        }

        System.out.println("Salário atual: " + salario);
    }
    
}
