package lista_exercicios;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {

        /*Entrar com 20 números e imprimir a soma dos positivos e o total de números
        negativos.*/

        double dbnumeros = 0, soma = 0, total = 0;

        Scanner numeros = new Scanner(System.in);
        System.out.println("Insira 20 números");

        for (int i = 0; i <= 5; i++) {
            dbnumeros = numeros.nextDouble();

            if (dbnumeros >= 0) {
                soma += dbnumeros;
            } else {
                total += dbnumeros;
            }
        }
        System.out.println("A soma dos números positivos: " + soma);
        System.out.println("");//espaço entre linhas.
        System.out.println("O total dos números negativos: " + total);

        numeros.close();
    }

}
