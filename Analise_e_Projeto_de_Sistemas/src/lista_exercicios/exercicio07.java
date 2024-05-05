package lista_exercicios;

import java.util.Scanner;
import java.lang.Math;
public class exercicio07 {

    public static void main(String[] args) {

        /*Elabore um programa em Java que leia a base e a altura de um retângulo e
        apresente o perímetro, a área e a diagonal, dada as fórmulas:
        perimetro = 2 * (base + altura)
        area = base * altura
        diagonal = Math.sqrt((base * base) + (altura * altura)) */

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor da base do retângulo");
        double base = dados.nextDouble();
        System.out.println("Digite o valor da altura do retângulo");
        double altura = dados.nextDouble();

        double resultado = ((base + altura) * 2);
        double area = base * altura;
        double diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.println("Perimetro do retâgulo :" + resultado);
        System.out.println("A área do retâgulo :" + area);
        System.out.println("A diagonal do retâgulo :" + diagonal);

        dados.close();
    }


}
