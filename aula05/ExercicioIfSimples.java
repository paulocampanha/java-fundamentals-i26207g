/**
 * Faça um programa que recebe do usuário o nome de um produto, o valor
 * atual do estoque e o valor do estoque mínimo. Se o valor atual do 
 * estoque for menor ou igual ao valor do estoque mínimo, imprima uma
 * mensagem de alerta:
 * "ESTOQUE ABAIXO DO MÍNIMO. SOLICITANDO PEDIDO AO DEPARTAMENTO DE COMPRAS"
 * No final, imprima a mensagem:
 * "Produto: [nome do produto]"
 * "Estoque atual: [estoque do produto]"
 */
package aula05;
import java.util.Scanner;
public class ExercicioIfSimples {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite a quantidade em estoque: ");
        double quantidadeEstoque = sc.nextDouble();
        System.out.print("Digite a quantidade do Estoque Mínimo: ");
        double quantidadeEstoqueMinimo = sc.nextDouble();

        if (quantidadeEstoque <= quantidadeEstoqueMinimo){
            System.out.println("ESTOQUE ABAIXO DO MÍNIMO. SOLICITANDO PEDIDO AO DEPARTAMENTO DE COMPRAS");
        }
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Estoque atual: " + quantidadeEstoque);

    }
}
