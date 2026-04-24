/*Exercício – Matriz Bidimensional em Java
Crie um programa em Java que utilize uma matriz bidimensional com 
3 linhas e 4 colunas (3x4). A matriz deverá ser preenchida com 
valores informados pelo usuário, respeitando o seguinte critério 
para cada linha:
1ª linha: nomes de cores que o usuário gosta
2ª linha: nomes de frutas que o usuário gosta
3ª linha: nomes de pessoas que o usuário gosta
Caso prefira, os temas podem ser substituídos por outros exemplos, 
como carros, filmes, esportes, séries, jogos, etc.
Após o preenchimento completo da matriz, o programa deverá percorrer 
a matriz e imprimir todos os valores digitados, organizando a saída 
de forma clara.
 */

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomeGrupo = {"Cor", "Fruta", "Nome de Pessoa"};
        String[][] grupos = new String[3][4];

        System.out.println("Digite o que se pede abaixo. Quatro itens de cada");

        for (int i = 0; i < grupos.length; i++){
            System.out.println(nomeGrupo[i] + " - digite seu/sua favorita.");
            for (int j = 0; j < grupos[i].length; j++ ){
                System.out.print("Digite: ");
                grupos[i][j] = sc.nextLine();
            }
        }

        for (int i = 0 ; i < grupos.length; i++) {
            System.out.println("Grupo: " + nomeGrupo[i]);
            for (int j = 0; j < grupos[i].length; j++){
                System.out.print(grupos[i][j] + " ");
            }
            System.out.println();
            System.out.println("=".repeat(40));
            
        }
    }
}


