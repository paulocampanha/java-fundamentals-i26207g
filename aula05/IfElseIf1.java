/**
 * Nesse programa vamos utilizar if e else if para testar perios periodos
 * do dia
 */
package aula05;
import java.util.Scanner;

public class IfElseIf1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o horário disponível (Somente hora cheia): ");
        int hora = sc.nextInt();
        if (hora <= 6) {
            System.out.println("Turno da Noite: das 22 às 6 horas");
        } else if(hora <= 14) {
            System.out.println("Turno da Manhã: das 6 às 14 horas");
        } else if(hora <= 22) {
            System.out.println("Turno da Tarde: das 14 às 22 horas");
        } else {
            System.out.println("Turno da Noite: das 22 às 6 horas");
        }



        sc.close();
    }
}
