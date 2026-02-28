/* Nesse programa vamos declarar variáveis String
	e fazer a concatenação de variáveis
*/
public class SaudacaoSimples {

	public static void main(String arg[]) {
		// Declaração de variável String
		String nome = "Gaspar";
		String sobrenome = "Rodrigues Souza";
		int idade = 25;
		double altura = 2;
		
		String saudacao = "Olá, " + nome + " " + sobrenome;
		saudacao = saudacao + "\nvocê tem " + idade;
		saudacao = saudacao + " anos e mede " + altura;
		saudacao = saudacao + " metros de altura.";
		
		System.out.println(saudacao);
	}
}