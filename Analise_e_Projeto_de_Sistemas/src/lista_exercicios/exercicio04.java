package lista_exercicios;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        /*Ler uma temperatura em graus centígrados e apresentá-la convertida em
        graus Fahrenheit. A fórmula de conversão é:
        • F= (C * (9/5)) + 32
        I. onde F é a temperatura em Fahrenheit e C é a temperatura em
        centígrados.*/

        Scanner x = new Scanner(System.in);
        System.out.println("Insira  quantos graus Celsius está hoje :");
        float celsius = x.nextFloat();

        float fahrenheit = ((celsius * 1.8f) + 32);
        System.out.println("A conversão de celsius para Fahrenheit é :" + fahrenheit);

        x.close();
    }

}


