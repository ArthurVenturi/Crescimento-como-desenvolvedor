package Estrutura_while;
import java.util.Scanner;

public class Ativ_2 {
    
    public static void main(String[] args) {
        
        System.out.println("insira um número inteiro");
        Scanner x = new Scanner(System.in);
        int numero = x.nextInt();
        int i = 1;
        int quadrados = 1;

        while (numero >= i) {
            
            quadrados = quadrados * numero;
            i++;
            
        }
        System.out.println("Os quadrados dos número são" + quadrados);
        x.close();
    }
}
