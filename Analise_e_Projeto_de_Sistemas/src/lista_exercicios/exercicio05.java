package lista_exercicios;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        /*Ler nome, endereço e telefone e imprimi-los. Utilizar String para
        desenvolvimento do exercício.*/

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o seu nome ");
        String stringnome = dados.nextLine();

        System.out.println("Digite sua telefone ");
        String inttelefone = dados.nextLine();

        System.out.println("Digite o seu endereço ");
        String stringendereco = dados.nextLine();

        System.out.println("O seu nome :" + stringnome);
        System.out.println("O seu telefone :" + inttelefone);
        System.out.println("O seu endereço :" + stringendereco);

        dados.close();
    }


}
