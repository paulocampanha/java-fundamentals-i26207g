package aula07;

import java.util.Scanner;
import java.io.Console;

public class SistemaLogin {
    public static void main(String[] args) {
        // 1. Scanner para dados comuns (nome, idade, etc)
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome de usuário: ");
        String usuario = leitor.nextLine();
        int tentativas = 1;
        // 2. Console para a senha (não aparece no terminal)
        Console dispositivoConsole = System.console();

        while (tentativas <= 3) {
            if (dispositivoConsole != null) {
                char[] senhaArray = dispositivoConsole.readPassword("Digite sua senha: ");
                String senha = new String(senhaArray);

                // Validação simples
                if (usuario.equals("admin") && senha.equals("1234")) {
                    System.out.println("\nAcesso concedido! Bem-vindo, " + usuario);
                } else {
                    System.out.println("\nUsuário ou senha incorretos.");
                }

                // Limpeza de rastro na memória (Boa prática!)
                java.util.Arrays.fill(senhaArray, ' ');
            } else {
                System.out.println("\n Erro: O console seguro não está disponível neste ambiente.");
                System.out.println("Dica: Execute o programa pelo Terminal/CMD, não pelo 'Run' da IDE.");
            }
            tentativas++;
        }
        leitor.close();
    }
}