/**
 * Nesse programa vamos importar a biblioteca Scanner para ler os dados
 * de entrada do usuário pelo teclado
 * Nome Completo, idade, altura (metros), sexo.
 */

import java.util.Scanner;

public class CadastroPessoas {
    
    public static void main(String args[]){
        String nomeCompleto;
        int idade;
        double altura;
        String sexo;

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        nomeCompleto = leia.nextLine();
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        System.out.print("Digite sua altura: ");
        altura = leia.nextDouble();
        System.out.print("Digite seu sexo: ");
        sexo = leia.next();   
        
        leia.close();

        System.out.println("Nome digitado: " + nomeCompleto);
        System.out.println("Idade digitada: " + idade);
        System.out.println("Altura digitada: " + altura);
        System.out.println("Sexo digitado: " + sexo);



    }
}
