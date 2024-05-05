package lista_exercicios;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        /*Entrar com 5 números e imprimir o maior e menor (suponha números diferentes). */

        double dbnumero = 0, dbmaior = Integer.MIN_VALUE, dbmenor = Integer.MAX_VALUE;

        Scanner numeros = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite o " + i + " número:");
            dbnumero = numeros.nextDouble();

            if (dbnumero > dbmaior) {
                dbmaior = dbnumero;
            } else if (dbnumero < dbmenor) {
                dbmenor = dbnumero;
            }
        }
        System.out.println("O maior número entre os 5 números: " + dbmaior);
        System.out.println("O menor número entre os 5 números: " + dbmenor);

        numeros.close();
    }


}
