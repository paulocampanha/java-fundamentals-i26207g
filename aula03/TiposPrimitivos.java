/**
 * Este programa demonstra a declaração e o uso dos
 * tipos primitivos em Java. 
 * Eles são a base para armazenar dados simples e 
 * eficientes.
*/
public class TiposPrimitivos{
	
	public static void main(String args[]){
		// Tipos de números inteiros
		byte idade = 25;
		short temperatura = -15000;
		int populacaoCidade = 587421;
		long distanciaEstrelas = 9876543210L;
		
		// Tipos de números decimais (ponto flutuante)
		float precoUnitario = 19.99f; // Sufixo f é obrigatório
		double pi = 3.1415926535;
		
		// Tipo para caracter e lógico
		char inicial = 'P';
		boolean ehAluno = false;
		
		System.out.println("====================");
		System.out.println("Tipo Byte");
		System.out.println("Idade: " + idade);
		System.out.println("====================");
		System.out.println("Tipo short");
		System.out.println("Temperatura: " + temperatura);
		System.out.println("====================");
		System.out.println("Tipo int");
		System.out.println("População da cidade" 
		+ populacaoCidade);
		System.out.println("====================");
		System.out.println("Tipo long");
		System.out.println("Distância das Estrelas: "
		+ distanciaEstrelas);
		System.out.println("====================");
		System.out.println("Tipo float");
		System.out.println("Preço Unitário: " 
		+ precoUnitario);
		System.out.println("====================");
		System.out.println("Tipo double");
		System.out.println("PI: " + pi);
		System.out.println("====================");
		System.out.println("Tipo char");
		System.out.println("Inicial do nome: " + inicial);
		System.out.println("====================");
		System.out.println("Tipo boolean");
		// Operador ternário
		// variável_boleana ? resposta_verdadeira : resposta_falsa
		System.out.println(ehAluno ? "Ele é aluno" : "Ele não é aluno");
		System.out.println("====================");
		
	}
}