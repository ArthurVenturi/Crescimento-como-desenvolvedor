package lista_exercicios;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        /*Elabore um programa em Java que leia dois valores inteiros e apresente o
        quociente e o resto da divisão entre eles.*/


        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número inteiro ");
        int intnumero1 = dados.nextInt();

        System.out.println("Digite outro número inteiro ");
        int intnumero2 = dados.nextInt();

        double doubledivsao = intnumero1 / intnumero2;
        double doubleresto = intnumero1 % intnumero2;

        System.out.println("O resultado da divisão : " + doubledivsao);
        System.out.println("O resto da divisão :" + doubleresto);

        dados.close();
    }


}
