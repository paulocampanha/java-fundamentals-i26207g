/**
 * Nesse programa vamos fazer o parcelamento de uma compra usando a estrutura
 * de repetição for
 */
package aula07;

public class ParcelasFor {
    
    public static void main(String args[]){
        double valorProduto = 2000;
        int parcelas = 8;
        int dia = 10;
        int mes = 4;
        int ano = 2026;
        double valorParcela = valorProduto / parcelas;

        for (int i = 1; i <= parcelas; i++){
            System.out.println(i + " - " + dia + "/" + mes + "/" + ano + 
                " - R$ " + String.format("%.2f", valorParcela));
            mes++;
            if (mes > 12){
                mes = 1;
                ano++;
            }
        }
    }
}
