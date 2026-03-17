/**
 * Nesse programa vamos calcular quantos minutos uma máquina leva para executar
 * uma tarefa, sabendo-se que ela leva 137 segundo para esse trabalho.
 */

public class ConversaoTempo {
    
    public static void main(String args[]){
        int totalSegundos = 137;
        int minutos = totalSegundos / 60;
        int segundosRestantes = totalSegundos % 60;

        System.out.println("Total de segundos: " + totalSegundos);
        System.out.println("A máquina levou " + minutos + 
            " minutos e " + segundosRestantes + " segundos.");
        
    }
}
