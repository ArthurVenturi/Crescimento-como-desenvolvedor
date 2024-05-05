package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio03 {

    public static void main(String[] args) {

        try {
            JOptionPane.showMessageDialog(null, "Bem_vindo!", "Exercício_03", JOptionPane.INFORMATION_MESSAGE);

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro", "Exercício_03",
                    JOptionPane.INFORMATION_MESSAGE));

            int intsucessor = numero + 1;
            int intantecessor = numero - 1;

            JOptionPane.showMessageDialog(null,
                    "O número sucessor: " + intsucessor + "\n" + "O número antecessor: " + intantecessor,
                    "Exercício_03", JOptionPane.INFORMATION_MESSAGE);
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
