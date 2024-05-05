package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio16 {

    public static void main(String[] args) {

        try {
            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_16", JOptionPane.INFORMATION_MESSAGE);

            for (int i = 1; i <= 100; i++) {

                JOptionPane.showMessageDialog(null, "Números de 1 até 100 : " + i, "Exercício_16",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Operador Inválido", "Examine o texto!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Contate o Administrador do Sistema", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
