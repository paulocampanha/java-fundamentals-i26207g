/**
 * Nesse programa vamos solitar o nome do usuario é a senha com 3 tentativas
 * Ao final da terceira tentativa sem exito, o sistema interrompe a solicitação
 * de usuário e senha
 */

package aula07;

import java.util.Scanner;
import java.io.Console;     // Biblioteca para ocultar a senha no console

public class VerificarSenha {

    public static void main(String args[]) {
        String usuario = "admin";
        String senha = "super123";

        int tentativas = 1;
        Scanner sc = new Scanner(System.in);
        Console cs = System.console();

        while (tentativas <= 3) {
            System.out.print("Digite o nome do usuário: ");
            String nomeUsuario = sc.next();
            //System.out.print("Digite a senha do usuario: ");

            char[] senhaArray = cs.readPassword("Digite a senha do usuario: ");

            String senhaUsusario = new String(senhaArray);
            if (nomeUsuario.equals(usuario) && senhaUsusario.equals(senha)) {
                break;
            } else {
                System.out.println("Nome do usuário ou senha incorretos.");
                if (tentativas < 3) {
                    System.out.println("Tente novamente...");
                }
                tentativas++; // equivalente à tetativas = tentativas + 1
            }
        }
        if (tentativas > 3) {
            System.out.println("Acesso negado. Número máximo de tentativas excedido.");
        } else {
            System.out.println("Acesso concedido. Seja bem-vindo ao Sistema Senai.");
        }
        sc.close();
    }
}
