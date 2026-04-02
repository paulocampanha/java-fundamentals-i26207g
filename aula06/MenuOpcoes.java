/**
 * Nesse programa vamos usar a estrutura 
 * switch case para escolher uma das opcoes do
 * menu
 */
package aula06;
import java.util.Scanner;

public class MenuOpcoes {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);        
        System.out.println("*** Menu de Serviços ***");
        System.out.println("1 - Novo documento de Identidade");
        System.out.println("2 - Carteira Profissional CTPS");
        System.out.println("3 - Carteira de Motorista");
        System.out.println("4 - Título de Eleitor");
        System.out.println("9 - Sair do Sistema");
        System.out.println("=".repeat(50));
        System.out.print("Digite um opção do menu: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Dirija-se à mesa 12.");
                break;
            case 2: 
                System.out.println("Dirija-se à mesa 25.");
                break;
            case 3:
                System.out.println("Dirija-se ao setor Amarelo.");
                break;
            case 4:
                System.out.println("Dirija-se os setor TRE.");
                break;
            case 9:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }


        sc.close();
    }
}
