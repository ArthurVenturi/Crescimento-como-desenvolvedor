package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio19 {

    public static void main(String[] args) {

        try {
            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_19", JOptionPane.INFORMATION_MESSAGE);

            int intquantidade = 0;
            double dbnumero = 0;

            for (; ; ) {
                dbnumero = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Digite um número" + "\n" + "Para parar a execução digite o número 0", "Exercício_19",
                        JOptionPane.INFORMATION_MESSAGE));

                if (dbnumero >= 100 && dbnumero <= 200) {
                    intquantidade++;
                } else if (dbnumero == 0) {
                    break;
                }
            }
            JOptionPane.showMessageDialog(null,
                    "A quantidade de números que foram digitados entre 100 e 200 foram : " + intquantidade,
                    "Exercício_19", JOptionPane.INFORMATION_MESSAGE);

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
