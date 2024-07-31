package jframe;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class principal {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setSize(500,600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Senac - Minha primeira janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(Boolean.TRUE);
		
		JLabel painel = new JLabel();
		//Adicional o painel no jframe
		janela.setContentPane(painel);
		
		GridLayout layout = new GridLayout(3, 3);
		painel.setLayout(layout);
		
		JLabel rotuloNome = new JLabel("Nome : ");
		janela.setVisible(Boolean.TRUE);
		
		JTextField campoNome = new JTextField();
		campoNome.setVisible(Boolean.TRUE);
		
		JLabel rotuloEmail = new JLabel("E-mail : ");
		janela.setVisible(Boolean.TRUE);
		
		JTextField campoEmail = new JTextField();
		campoNome.setVisible(Boolean.TRUE);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setVisible(Boolean.TRUE);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setVisible(Boolean.TRUE);
		
		JTabbedPane abas = new JTabbedPane();
		janela.setContentPane(abas);
		
		abas.add("Aba 1", campoNome);
		abas.add("Aba 2", campoEmail);
		
		painel.add(rotuloNome);
		painel.add(campoNome);
		
		painel.add(rotuloEmail);
		painel.add(campoEmail);
		
		painel.add(btnSair);
		painel.add(btnLimpar);
		
		janela.add(painel);
		
		
	}

}
