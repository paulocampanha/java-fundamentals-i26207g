/**
 * Nesse programa vamos solicitar a entrada da cidade em que
 * o candidato reside. Nesse caso, os candidatos não podem 
 * residir na cidade de São Paulo, apenas em outras cidades
 */

package aula06;
import java.util.Scanner;


public class SelecaoCidade {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Recrutamento e Seleção");
        System.out.print("Digite o nome da sua cidade: ");
        String cidade = sc.nextLine();
        System.out.println(cidade);
        
        if (!(cidade.equalsIgnoreCase("Guarulhos")) && 
            !(cidade.equalsIgnoreCase("Santa Isabel")) ) {
                System.out.println("Envie seu curriculo para o e-mail");
                System.out.println("selecao@sp.senai.br");
            } else {
                System.out.println("Está vaga Home-Office não é para " + 
                "moradores de Guarulhos");
            }


        sc.close();
    }
}
