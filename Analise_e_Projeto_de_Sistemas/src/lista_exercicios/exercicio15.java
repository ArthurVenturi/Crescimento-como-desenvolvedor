package lista_exercicios;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        /*Ler um número e imprimir se ele é igual a 5, a 200, a 400, se está no intervalo
        entre 500 e 1000, inclusive, ou se ele está fora dos escopos anteriores.*/

        Scanner dados = new Scanner(System.in);
        System.out.println("Insira um número");
        double dbnumero = dados.nextDouble();

        if (dbnumero == 5) {
            System.out.println("O número pertence ao escopo 5");
        } else if (dbnumero == 200) {
            System.out.println("O número pertence ao escopo 200");
        } else if (dbnumero == 400) {
            System.out.println("O número pertence ao escopo 400");
        } else if (dbnumero >= 500 && dbnumero <= 1000) {
            System.out.println("O número pertence no intervalo entre 500 e 1000: " + dbnumero);
        } else {
            System.out.println("O número digitado não pertence à nenhum escopo.");
        }

        dados.close();
    }


}
