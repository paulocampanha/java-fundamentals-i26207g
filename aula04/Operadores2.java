

public class Operadores2 {

    public static void main(String args[]){
        int num1 = 4;
        int num2 = 6;
        int num3 = 2;
        
        //Procedência de Operadores
        int total1 = num1 + num2 * num3;

        System.out.println("Total 1: " + total1);

        int total2 = (num1 + num2) * num3;

        System.out.println("Total 2:" + total2);
    }
}
