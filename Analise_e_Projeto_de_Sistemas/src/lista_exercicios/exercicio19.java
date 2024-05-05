package lista_exercicios;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        /*Ler vários números e informar quantos números entre 100 e 200 foram 0
        digitados. Quando o valor 0 (zero) for lido, o algoritmo deverá parar sua
        execução.*/

        int i = 0, j = 0, intquantidade = 0;
        double dbnumero = 0;

        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite vários número");

        while (i == j) {
            dbnumero = numeros.nextDouble();

            if (dbnumero >= 100 && dbnumero <= 200) {
                intquantidade++;
            } else if (dbnumero == 0) {
                break;
            }
            System.out.println("Para parar a execução digite o número 0");
            i++;
        }
        System.out.println("A quantidade de números que foram digitados entre 100 e 200 foram: " + intquantidade);

        numeros.close();
    }

}
