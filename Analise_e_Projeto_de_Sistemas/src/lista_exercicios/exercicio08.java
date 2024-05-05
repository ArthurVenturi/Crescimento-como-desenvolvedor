package lista_exercicios;

import java.util.Scanner;

public class exercicio08 {


    public static void main(String[] args) {

        /*Elabore um programa em Java que leia a base e a altura de um triângulo,
                calcule e apresente a área*/

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor da base do trinângulo");
        double base = dados.nextDouble();
        System.out.println("Digite o valor da altura do triângulo");
        double altura = dados.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A área do triângulo :" + area);

        dados.close();
    }

}


