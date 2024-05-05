package lista_exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        /*Ler um número inteiro e imprimir seu sucessor e antecessor. Utilize os
        operadores de incremento e decremento.*/

        int numero = 0, sucessor = 0, antecessor = 0;

        Scanner impremir = new Scanner(System.in);
        System.out.println("Digite um número inteiro :");
        numero = impremir.nextInt();

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.println("O número sucessor :" + sucessor);
        System.out.println("O número antecessor :" + antecessor);

        impremir.close();
    }

}


