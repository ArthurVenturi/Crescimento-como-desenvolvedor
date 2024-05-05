package lista_exercicios;

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        /*Criar um algoritmo que deixe escolher qual a tabuada de multiplicar que se
        deseja imprimir todos os valores de 1 a 10.*/

        Scanner tabuada = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 10 para determinar a tabuada");
        int intnumero = tabuada.nextInt();
        System.out.println("Tabuada do " + intnumero);

        for (int i = intnumero; i <= intnumero; i++) {
            for (int j = 1; j <= 10; j++) {
                int inttabuada = i * j;
                System.out.println(i + " * " + j + " = " + inttabuada);
            }
        }
        tabuada.close();
    }

}
