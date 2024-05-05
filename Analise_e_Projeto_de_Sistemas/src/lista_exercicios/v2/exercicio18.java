package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio18 {

    public static void main(String[] args) {

        try {
            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_18", JOptionPane.INFORMATION_MESSAGE);

            int intnumero = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite um número entre 1 a 10 para determinar a tabuada : ",
                            "Exercício_18", JOptionPane.INFORMATION_MESSAGE));

            JOptionPane.showMessageDialog(null, "Tabuada do " + intnumero, "Exercício_18",
                    JOptionPane.INFORMATION_MESSAGE);

            StringBuilder tabuada = new StringBuilder();

            for (int i = intnumero; i <= intnumero; i++) {
                for (int j = 1; j <= 10; j++) {
                    int inttabuada = i * j;

                    tabuada.append(i).append(" * " + j + " = " + inttabuada + "\n");
                }

                String tabuadadados = tabuada.substring(0, tabuada.length() - 1);

                JOptionPane.showMessageDialog(null, tabuadadados, "Exercício_18", JOptionPane.INFORMATION_MESSAGE);
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
