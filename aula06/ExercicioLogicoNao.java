/**
 * Crie um programa onde o usuário deve digitar a senha antiga e a senha nova.
 * Se a senha nova não for igual a senha antiga imprima, 
 * "Senha alterada com sucesso". Caso contrario imprima, 
 * "ERRO: A nova senha não pode ser igual a senha anterior."
 */

package aula06;
import java.util.Scanner;
public class ExercicioLogicoNao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha antiga: ");
        String senhaAntiga = sc.nextLine();
        System.out.print("Digite a senha nova: ");
        String senhaNova = sc.nextLine();

        if (!(senhaNova.equals(senhaAntiga))){
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("ERRO: A nova senha não pode ser igual a senha anterior.");
        }
        
        sc.close();

    }
    
}
