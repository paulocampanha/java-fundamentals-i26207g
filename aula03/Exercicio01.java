/* Faça um programa para imprimir os dados de um 
produto. Seu programa deve imprimir:
Nome do Produto: Bolacha de Água e Sal
Categoria: Alimentos
Quantidade: 150
Preço: R$ 5.49

Utilize variáveis do tipo String, int, float
*/
public class Exercicio01 {
		
	public static void main(String args[]){
		
		String nomeProduto = "Bolacha de Água e Sal";
		String categoria = "Alimentos";
		int quantidade = 150;
		float preco = 5.49f;
		
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Categoria: " + categoria);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço: R$ " + preco);
	}
}
