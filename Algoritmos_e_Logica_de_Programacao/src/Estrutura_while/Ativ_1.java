package Estrutura_while;
import java.util.Scanner;

public class Ativ_1 {
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.println("Insira um número inteiro");
        int numero = x.nextInt();
        int i = 1;
        int soma = 0;
        
        while (numero >= i ) {
            soma = soma + i;
            i++;
        
        }
            System.out.println("Soma dos números são" +soma);
            x.close();
        }
}

