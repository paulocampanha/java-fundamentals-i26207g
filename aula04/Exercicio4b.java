/**
## Exercicio04b: Cálculo de Saldo Simples (double)

1. Declare e inicialize a variável `saldo` com o valor inicial 
de 1500
2. Imprima o Saldo Inicial no console. (Use String.format())
3. Simule um débito de R$ 350.00 (`despesa`).
4. Imprima o Novo Saldo no console. (Use String.format())
5. Simule um crédito de R$ 500.00 (`receita`).
6. Imprima o Novo Saldo no console. (Use String.format())
 */

public class Exercicio4b {

    public static void main(String[] args) {
        
        double saldo = 1500.00;
        System.out.println("Saldo Inicial: R$ " 
        + String.format("%,.2f", saldo));
        
        saldo -= 350.00;

        System.out.println("Saldo Atualizado (-350,00): R$ " 
        + String.format("%,.2f", saldo));

        saldo = saldo + 500.00;

        System.out.println("Saldo Atualizado (+500,00): R$ " 
        + String.format("%,.2f", saldo));
        
        

    }
    
}
