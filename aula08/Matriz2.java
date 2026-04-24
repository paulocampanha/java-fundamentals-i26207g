/**
 * Nesse programa vamos estudar array bidimensional (matriz). 
 * Nesse exemplo vamos criar a array com os valores
 */

public class Matriz2 {
    
    public static void main(String args[]){

        double[][] notas = {
            // Linha 0
            {4.5, 6.9, 5.5, 3.2},
            // Linha 1
            {10.0, 9.9, 9.5, 10.0},
            // Linha 2
            {2.5, 3.4, 3.2, 2.2},
            // Linha 3
            {4.5, 6.6, 8.2, 5.5}
        };

        String[] alunos = {"Gaspar", "Anabela", "Jorge", "Luiza"};
        double[] medias = new double[4];

        double[] somaNotas = {0, 0, 0, 0};

        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[i].length; j++){
                somaNotas[i] += notas[i][j];
            }
            medias[i] = somaNotas[i] / notas[i].length;
        }
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Média: " + medias[i]);
            if (medias[i] >= 6){
                System.out.println("Conceito: APROVADO");
            } else if(medias[i] >= 3 && medias[i] < 6) {
                System.out.println("Conceito: RECUPERAÇÃO");
            } else {
                System.out.println("Conceito: REPROVADO");
            }
            System.out.println("=".repeat(40));
        }

    }

}
