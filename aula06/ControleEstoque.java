/**
 * Nesse programa vamos verificar se o estoque está negativos
 * usando o operador lógico NOT (!)
 */
package aula6;
import java.util.Scanner;

public class ControleEstoque {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Controle de Estoque");
        System.out.print("Digite a quantidade no estoque: ");
        int quantidadeEstoque = sc.nextInt();

        if (!(quantidadeEstoque > 0)) {
            System.out.println("Produto esgotado no momento.");
        } else if (!(quantidadeEstoque > 100)) {
            System.out.println("Estoque mínimo atingido");
            System.out.println("Solicitação de compra emitido.");
        } else {
            System.out.println("Produto sendo separado.");
        }

        sc.close();
    }
}
