package lista_exercicios;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        /*Entrar com um número e imprimir a raiz quadrada do número caso ele seja
        positivo e o quadrado do número caso ele seja negativo.*/

        Scanner dado = new Scanner(System.in);
        System.out.println("Digite um número");
        double dbnumero = dado.nextDouble();

        if (dbnumero >= 0) {
            double dbraiz_quadrada = Math.sqrt(dbnumero);
            System.out.println("A raiz quadrada do número : " + dbraiz_quadrada);
        } else {
            double dbquadrado = ((dbnumero - 1) * (dbnumero + 1)) + 1;
            System.out.println("O quadrado do número : " + dbquadrado);
        }
        dado.close();
    }


}
