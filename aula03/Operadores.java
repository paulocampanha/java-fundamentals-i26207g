/* Nesse programa vamos estudar os operadores aritmeticos
usados para realizar operações matemáticas básicas.
Adição ( + )
Subtração ( - )
Multiplicação ( * )
Divisão ( / )
Modulo(Resto da divisão) ( % )
*/
public class Operadores {
	
	public static void main(String args[]){
		
		int valor1 = 29;
		int valor2 = 13;
		double valor3 = 2.5;
		
		// Soma
		int soma1 = valor1 + valor2;
		double soma2 = valor1 + valor3;
		int soma3 = valor2 + (int)valor3; //cast 
		
		System.out.println("A soma de " + valor1 
		+ " com " + valor2 + " é igual a " + soma1);
		
		System.out.println("A soma de " + valor1 
		+ " com " + valor3 + " é igual a " + soma2);
		
		System.out.println("A soma de " + valor2 
		+ " com " + (int)valor3 + " é igual a " + soma3);
		
		int sub1 = valor1 - valor2;
		int sub2 = valor2 - valor1;
		double sub3 = valor1 - valor3;
		
		System.out.println("=============================");
		System.out.println("A subtração de " + valor1
		+ " por " + valor2 + " é igual a " + sub1);
		
		System.out.println("A subtração de " + valor2
		+ " por " + valor1 + " é igual a " + sub2);
		
		System.out.println("A subtração de " + valor1
		+ " por " + valor3 + " é igual a " + sub3);
		
		int mult1 = valor1 * valor2;
		double mult2 = valor1 * valor3;
		int mult3 = valor2 * (int)valor3;
		
		System.out.println("=============================");
		System.out.println("A multiplicação de " + valor1
		+ " por " + valor2 + " é igual a " + mult1);
		
		System.out.println("A multiplicação de " + valor1
		+ " por " + valor3 + " é igual a " + mult2);
		
		System.out.println("A multiplicação de " + valor2
		+ " por " + (int)valor3 + " é igual a " + mult3);
		
		double div1 = (double)valor1 / (double)valor2;
		double div2 = (double)valor2 / (double)valor1;
		double div3 = (double)valor1 / valor3;
		double div4 = (double)valor2 / valor3;

		System.out.println("==============================");
		System.out.println("A divisão de " + valor1
		+ " por " + valor2 + " é igual a " + div1);
		
		System.out.println("A divisão de " + valor2 
		+ " por " + valor1 + " é igual a " + div2);
		
		System.out.println("A divisão de " + valor1
		+ " por " + valor3 + " é igual a " + div3);
		
		System.out.println("A divisão de " + valor2
		+ " por " + valor3 + " é igual a " + div4);
		
		int resto = valor1 % valor2;
		
		System.out.println("O resto da divisão de " 
		+ valor1 + " por " + valor2 + " é igual a "
		+ resto);
	}
}