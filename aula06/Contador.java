package aula6;
/**
 * Nesse programa vamos usar a estrutra de repetição While
 * para imprimir uma sequência de número do 1 ao 10
 */

public class Contador {
    
    public static void main(String args[]){
        int contador = 1;

        while (contador <= 10){
            System.out.println("Numero: " + contador);
            System.out.println("-".repeat(10));
            contador++;   // contador = contador + 1
        }
    }
}
