package lista_exercicios;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        /*Fazer um algoritmo que calcule a média aritmética das 3 notas de um aluno
        e mostre, além do valor da média do aluno, uma mensagem de "Aprovado", caso a média seja igual ou superior a 7, ou a mensagem "Reprovado", caso
        contrário.*/

        Scanner notas = new Scanner(System.in);
        System.out.println("Insira a primeira nota:");
        double nota1 = notas.nextFloat();

        System.out.println("Insira a segunda nota:");
        double nota2 = notas.nextFloat();

        System.out.println("Insira a terceira nota:");
        double nota3 = notas.nextFloat();

        double media_aritmedica = ((nota1 + nota2 + nota3) / 3);

        if (media_aritmedica >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Sua média foi de " + media_aritmedica);
        } else {
            System.out.println("Reprovado");
            System.out.println("Sua média foi de " + media_aritmedica);
        }

        notas.close();
    }

}
