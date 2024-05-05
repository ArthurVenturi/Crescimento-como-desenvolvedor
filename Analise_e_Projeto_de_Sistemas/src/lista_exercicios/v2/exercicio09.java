package lista_exercicios.v2;

import javax.swing.JOptionPane;

public class exercicio09 {

    public static void main(String[] args) {

        try {
            JOptionPane.showMessageDialog(null, "Bem-vindo! ", "Exercício_09", JOptionPane.INFORMATION_MESSAGE);

            double doubleraio = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite o valor do raio do cilindro :", "Exercício_09", JOptionPane.INFORMATION_MESSAGE));

            double doublealtura = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite o valor da altura do cilindro :", "Exercício_09", JOptionPane.INFORMATION_MESSAGE));

            double volume = (3.14159 * (doubleraio * doubleraio)) * doublealtura;
            JOptionPane.showMessageDialog(null, "O volume do cilindro : " + volume);
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
