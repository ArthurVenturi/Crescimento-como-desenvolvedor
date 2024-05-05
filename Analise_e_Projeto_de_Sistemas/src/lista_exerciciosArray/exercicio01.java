package lista_exerciciosArray;

import javax.swing.JOptionPane;

public class exercicio01 {

    public static void main(String[] args) {

        /*
         * Escreva uma classe Principal Java que preenche um array de tamanho 10 com
         * números inteiros lidos pelo teclado utilizando JOptionPane e tratando
         * possíveis exceções e exiba a média dos valores do array com JOptionPane.
         */

        try {

            int[] array = new int[10];
            double soma = 0, media;

            for (int i = 0; i < 10; i++) {

                array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro",
                        "exercicio 01", JOptionPane.INFORMATION_MESSAGE));

                soma = soma + array[i];
            }

            media = soma / 10;

            JOptionPane.showMessageDialog(null, "A média dos numero inteiros digitados são : " + media, "exercicio 01",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Operador inválido", "exercicio 01",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Utrapassou a quantidade do array", "exercicio 01",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema contate o administrador do sistema", "exercicio 01",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}


