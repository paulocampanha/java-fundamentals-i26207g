package aula07;
/**
 * Nesse programa vamos estudar a estrutura de repetição for. 
 */
public class ContadorFor {
    
    public static void main (String args[]) {

        /*
        int contador = 1;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }
        */

        for (int contador = 1; contador <= 10; contador++){
            System.out.println(contador);
        }

        System.out.println("=".repeat(50));
        System.out.println("Contagem regressiva");

        for (int i = 10; i > 0; i--){
            System.out.print(i + "...");
        }
        System.out.println("F O G O ! ! !");

        System.out.println("=".repeat(50));
        System.out.println("Sequência de 10 em 10");

        for (int i = 20; i <= 110; i += 10) {
            System.out.println(i);
        }

    }
}
