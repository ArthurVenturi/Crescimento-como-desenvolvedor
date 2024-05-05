package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio05 {

    public static void main(String[] args) {

        try {


            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_05", JOptionPane.INFORMATION_MESSAGE);

            String stringnome = JOptionPane.showInputDialog(null, "Digite o seu nome", "Exercício_05",
                    JOptionPane.INFORMATION_MESSAGE);

            String stringtelefone = JOptionPane.showInputDialog(null, "Digite o seu telefone", "Exercício_05",
                    JOptionPane.INFORMATION_MESSAGE);

            String stringendereco = JOptionPane.showInputDialog(null, "Digite o seu endereço", "Exercício_05",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "O seu nome : " + stringnome + "\n" + "O seu telefone :" + stringtelefone
                    + "\n" + "O seu endereço : " + stringendereco);
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
