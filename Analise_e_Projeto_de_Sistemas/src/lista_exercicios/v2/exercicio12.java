package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio12 {

    public static void main(String[] args) {

        try {
            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_12", JOptionPane.INFORMATION_MESSAGE);

            double doublenota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota :",
                    "Exercício_12", JOptionPane.INFORMATION_MESSAGE));

            double doublenota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número inteiro :",
                    "Exercício_12", JOptionPane.INFORMATION_MESSAGE));

            double doublenota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número inteiro :",
                    "Exercício_12", JOptionPane.INFORMATION_MESSAGE));

            double media_aritmedica = ((doublenota1 + doublenota2 + doublenota3) / 3);

            if (media_aritmedica >= 7.0) {
                JOptionPane.showMessageDialog(null, " Aprovado" + "\n" + "Sua média foi de : " + media_aritmedica,
                        "Exercicío_12", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Reprovado" + "\n" + "Sua média foi de : " + media_aritmedica,
                        "Exercicío_12", JOptionPane.INFORMATION_MESSAGE);

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
