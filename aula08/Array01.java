/**
 * Nesse programa vamos estudar o use de Arrays
 */

public class Array01 {
    
    public static void main(String args[]) {

        String[] alunos = {"Gaspar", "Anabela", "Jorge", "Luiza",
            "Bruce"};
        
        double[] notas = new double[5];

        notas[0] = 5.5;
        notas[1] = 4;
        notas[2] = 6.8;
        notas[3] = 10;
        notas[4] = 2.1;

        for (int i = 0; i < 5; i++){
            System.out.println("Aluno: " + alunos[i] +
                " - Nota: " + notas[i]);
        }

        notas[3] = 9.5;
        System.out.println("Aluno: " + alunos[3] + 
            " - Nota alterada: " + notas[3]);
    }
}
