package aula01.Trabalho;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Cliente> listaCliente = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
        	
        	String cpf = JOptionPane.showInputDialog(null, "Digite o cpf do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE);
        	
        	int anoNascimeto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano de Nascimento do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE));

        	String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE);
        	
        	String email = JOptionPane.showInputDialog(null, "Digite o email do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE);
        	
        	String rua = JOptionPane.showInputDialog(null, "Digite a rua do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE);
        	
        	String bairro = JOptionPane.showInputDialog(null, "Digite o bairro do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE);
        	
        	int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da rua do cliente", "Trabalho", JOptionPane.INFORMATION_MESSAGE));
        	
        	Cliente cliente = new Cliente(cpf, anoNascimeto, nome, email, new Endereco(rua, bairro, numero));
            
        	listaCliente.add(cliente);
        }
        
        for (int i = 0; i < listaCliente.size(); i++) {
           System.out.println(listaCliente.get(i));

        }

    }
}
