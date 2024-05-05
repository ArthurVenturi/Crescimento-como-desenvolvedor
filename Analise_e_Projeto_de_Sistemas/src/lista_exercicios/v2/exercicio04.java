package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio04 {

    public static void main(String[] args) {

        try {

            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_04", JOptionPane.INFORMATION_MESSAGE);

            double doublecelsius = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Insira o valor da temperatura que está hoje",
                    "Exercício_04", JOptionPane.INFORMATION_MESSAGE));

            double fahrenheit = ((doublecelsius * 1.8f) + 32);
            JOptionPane.showMessageDialog(null, "A conversão de celsius para Fahrenheit: "
                            + fahrenheit, "Exercício_04",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Operador Inválido",
                    "Examine o texto!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }


}
