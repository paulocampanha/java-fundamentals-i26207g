/**
 * Nesse programa vamos estudar o uso da classe String
 */
public class String2 {
    
    public static void main(String args[]) {

        String frase = "     Hoje está chovendo.     ";
        System.out.println(frase);
        String frase2 = "Amanhã deve chover também.";
        System.out.println(frase + frase2);
        // Removendo os espaços
        System.out.println(frase.trim()+ frase2);
        // se(resposta == "S")
        String resposta = "S";
        System.out.println("Aceitou o valor: " + resposta.equals("s"));
        System.out.println("Realmente aceitou: " 
        + resposta.equalsIgnoreCase("s"));
        resposta = "SIM";
        System.out.println("Respondeu 's': " 
        + resposta.substring(0,1).equalsIgnoreCase("s"));
    }
}
