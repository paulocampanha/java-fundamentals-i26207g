/**
 * Nesse programa vamos estudar o uso da classe String
 */

public class String1 {

    public static void main(String args[]){

        String nome = "Gaspar Galego Souza";

        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Minúsculas: " + nome.toLowerCase());
        System.out.println("Normal: " + nome);
        System.out.println("Número de caracters: " + nome.length());
        System.out.println("Tem Galego no nome: " + nome.contains("Galego"));
        System.out.println("Tem SOUZA no nome: " + nome.contains("SOUZA"));
        System.out.println("Tem GASPAR no nome: " 
        + nome.toUpperCase().contains("GASPAR"));
        System.out.println("Parte do nome: " 
        + nome.substring(7, 13));
        
        
    }
}
