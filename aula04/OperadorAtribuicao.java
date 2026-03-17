/**
 * Nesse programa vamos trabalhar com operadores de atribuição simples (=) e
 * compostos (+=, -=, *=, /= e %=)
 */

public class OperadorAtribuicao {
    
    public static void main(String args[]){

        int total = 500;

        System.out.println("Valor total: " + total);

        // Adicionando 100 ao total
        total = total + 100;

        System.out.println("Novo total (+100): " + total);

        // Adicionando 150 ao total
        total += 150;  // Equivalente a total = total + 150
        System.out.println("Novo total(+150): " + total);

        // Subtraindo 75 do total
        total -= 75;   // Equivalente a total = total - 75
        System.out.println("Novo total(-75): " + total);

        // Multiplindo o total por 3
        total *= 3;    // Equivalente a total = total * 3
        System.out.println("Novo total(*3): " + total);

        // Dividindo o total por 2
        total /= 2;    // Equivalente a total = total / 2;
        System.out.println("Novo total(/2): " + total);

        // Módulo do total por 5
        total %= 5;    // Equivalente a total = total % 5
        System.out.println("Novo total(%5): " + total);

    }
}
