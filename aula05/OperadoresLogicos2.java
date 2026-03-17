/**
 * Nesse programa vamos verificar a classificação de um hardware
 */

package aula05;
import java.util.Scanner;

public class OperadoresLogicos2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a memória do computador: ");
        int memoria = sc.nextInt();
        System.out.print("Digite o processador do computador: ");
        String processador = sc.next();

        if (memoria >= 16 && (processador.equals("i7") || processador.equals("i9"))){
            System.out.println("Requisitos recomendados atendidos: Desempenho Ultra.");
        } else if (memoria >= 8 && (processador.equals("i5") || 
        processador.equals("i7") || processador.equals("i9"))){
            System.out.println("Requisitos mínimos atendidos: Desempenho Média.");
        } else {
            System.out.println("Hardware insuficiente para esse software");
        }



        sc.close();
    }
}
