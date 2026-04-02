package aula07;

import java.util.Scanner;

public class ExercicioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================== ENTRADA DE DADOS ==================
        System.out.print("Nome do vendedor: ");
        String vendedor = sc.nextLine();

        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Valor total da compra: ");
        double valorTotal = sc.nextDouble();

        System.out.print("Quantidade de parcelas (1 a 10): ");
        int parcelas = sc.nextInt();

        System.out.print("Dia de pagamento (5, 10, 15, 20 ou 25): ");
        int diaPagamento = sc.nextInt();

        if (parcelas == 1) {
            double desconto = valorTotal * 0.10; // desconto de 10%
            valorTotal -= desconto;   // valorTotal = valorTotal - desconto
        }

        double valorParcela = valorTotal / parcelas;

        // ================== SAÍDA ==================
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("          *****  Lojas Maribase *****");
        System.out.println("=".repeat(50));
        System.out.println("Vendedor: " + vendedor);
        System.out.println("-".repeat(50));
        System.out.println("Produto: " + produto);
        System.out.println("Valor: R$ " + valorTotal);
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Dia Pgto.: " + diaPagamento);
        System.out.println("-".repeat(50));
        System.out.println("Parcelas");
        System.out.println("-".repeat(50));

        // ================== CARNÊ ==================
        int numeroParcela = 1;
        int mes = 4; // Abril
        int ano = 2026;

        while (numeroParcela <= parcelas) {

            System.out.println(numeroParcela + " - " + diaPagamento + "/" + mes + "/" + ano + " - R$ " + valorParcela);

            numeroParcela++;
            mes++;

            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }

        System.out.println("=".repeat(50));
        System.out.println("+++++ SISGER - Sistema Gerenciador de Loja +++++");
        System.out.println("=".repeat(50));

        sc.close();
    }
}