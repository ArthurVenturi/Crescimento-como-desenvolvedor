package lista_exercicios;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        /*Elabore um programa em Java que leia o valor da altura e o raio de uma lata
        de óleo, e então calcule o seu volume, utilizando a fórmula:
            Volume = 3.14 * (R * R) * altura */

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor do raio do cilindro");
        double raio = dados.nextDouble();
        System.out.println("Digite o valor da altura do cilindro");
        double altura = dados.nextDouble();

        double volume = (3.14159 * (raio * raio)) * altura;
        System.out.println("O volume do cilindro :" + volume);

        dados.close();
    }


}
