/**
 * Nesse programa vamos criar uma Array com os números palpite 
 * para jogar na MegaSena
 */

import java.util.Random;

public class Array03 {
    
    public static void main(String args[]){
        
        int[] numeros = new int[6];
        Random rd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(60) + 1; 
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
