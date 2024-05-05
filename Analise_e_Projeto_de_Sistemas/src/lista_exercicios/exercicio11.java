package lista_exercicios;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        /*Faça um algoritmo que receba a idade de uma pessoa e mostre a mensagem
        de maioridade ou não.*/

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = dados.nextInt();

        if (idade >= 18) {
            System.out.println("Você está na maioridade");
        } else {
            System.out.println("Você está com idade inferior à da maioridade");
        }
        dados.close();
    }


}
