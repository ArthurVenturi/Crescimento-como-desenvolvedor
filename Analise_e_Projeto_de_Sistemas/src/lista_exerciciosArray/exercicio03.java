package lista_exerciciosArray;

import javax.swing.JOptionPane;

public class exercicio03 {

    public static void main(String[] args) {

        /*
         * Escreva uma classe Principal Java que solicita 8 inteiros ao usuário com
         * JOptionPane e guarda esses valores em um array. Depois o programa deve
         * descobrir e exibir qual a posição do elemento de maior valor e exibi-lo
         * utilizando JOptionPane.
         */

        try {

            int[] array = new int[8];
            int maior = 0;

            for (int i = 0; i < array.length; i++) {

                array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira números inteiros", "exercicio 02",
                        JOptionPane.INFORMATION_MESSAGE));
            }

            for (int i = 0; i < array.length; i++) {

                if (maior < array[i]) {
                    maior = array[i];
                }
            }

            JOptionPane.showMessageDialog(null, "O maior número dos valores digitados é : " + maior, "exercicio 02",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Operador inválido", "exercicio 02", JOptionPane.ERROR_MESSAGE);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Utrapassou a quantidade do array", "exercicio 02",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema contate o administrador do sistema", "exercicio 02",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}


