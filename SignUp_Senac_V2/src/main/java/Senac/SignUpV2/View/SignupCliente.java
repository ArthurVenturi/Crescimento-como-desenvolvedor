package Senac.SignUpV2.View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Senac.SignUpV2.Model.Cliente;
import Senac.SignUpV2.Connection.MySQLConnection;
import Senac.SignUpV2.DAO.ClienteDAO;

public class SignupCliente {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Senac - Signup - Cliente");
		janela.setSize(650, 360);
		janela.getContentPane().setBackground(new Color(248, 248, 250));
		janela.setLocation(327, 227);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);

		JPanel painel = new JPanel();
		janela.add(painel);
		janela.setContentPane(painel);

		GridLayout layout = new GridLayout(8, 2, 6, 6);
		painel.setLayout(layout);

		janela.setContentPane(painel);

		/*------------------------------------------------------------*/

		JLabel rotuloNome = new JLabel("Nome: ", JLabel.LEFT);
		rotuloNome.setVisible(Boolean.TRUE);

		JTextField campoNome = new JTextField();

		campoNome.setVisible(true);

		painel.add(rotuloNome);
		painel.add(campoNome);

		/*------------------------------------------------------------*/

		JLabel rotuloEmail = new JLabel("Email: ", JLabel.LEFT);
		rotuloEmail.setVisible(Boolean.TRUE);

		JTextField campoEmail = new JTextField();
		campoEmail.setVisible(true);

		painel.add(rotuloEmail);
		painel.add(campoEmail);

		/*------------------------------------------------------------*/

		JLabel rotuloCurso = new JLabel("Curso: ", JLabel.LEFT);
		rotuloCurso.setVisible(Boolean.TRUE);

		JTextField campoCurso = new JTextField();
		campoCurso.setVisible(true);

		painel.add(rotuloCurso);
		painel.add(campoCurso);

		/*------------------------------------------------------------*/

		JLabel rotuloDataNascimento = new JLabel("Data de Nascimento: ", JLabel.LEFT);
		rotuloDataNascimento.setVisible(Boolean.TRUE);

		JTextField campoDataNascimento = new JTextField();
		campoDataNascimento.setVisible(true);

		painel.add(rotuloDataNascimento);
		painel.add(campoDataNascimento);

		/*------------------------------------------------------------*/

		JLabel rotuloPCD = new JLabel("Possui Deficiência? ", JLabel.LEFT);
		rotuloPCD.setVisible(Boolean.TRUE);

		ButtonGroup grupo = new ButtonGroup();
		JRadioButton btnSim = new JRadioButton("Sim");
		JRadioButton btnNao = new JRadioButton("Nao");

		grupo.add(btnSim);
		grupo.add(btnNao);

		JPanel jradioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jradioPanel.add(btnSim);
		jradioPanel.add(btnNao);

		painel.add(rotuloPCD);
		painel.add(jradioPanel);

		/*------------------------------------------------------------*/

		JLabel rotuloIdade = new JLabel("Idade : ", JLabel.LEFT);
		rotuloIdade.setVisible(Boolean.TRUE);

		JTextField campoIdade = new JTextField();
		campoIdade.setVisible(true);

		painel.add(rotuloIdade);
		painel.add(campoIdade);

		/*------------------------------------------------------------*/

		JLabel rotuloRend = new JLabel("Renda: ");
		rotuloRend.setVisible(Boolean.TRUE);

		String rendas[] = { "até 1.412", "1412 a 4.236", "4.236 a 12.708", "12.708 +" };
		JComboBox<String> btn = new JComboBox<String>(rendas);
		btn.setBounds(50, 50, 50, 50);

		painel.add(rotuloRend);
		painel.add(btn);

		/*------------------------------------------------------------*/

		ButtonGroup grupoButtoes = new ButtonGroup();

		JButton btnSalvar = new JButton("Salvar");
		JButton btnLimpar = new JButton("Limpar");
		JButton btnExcluir = new JButton("Excluir");
		JButton btnSair = new JButton("Sair");

		grupoButtoes.add(btnSalvar);
		grupoButtoes.add(btnLimpar);
		grupoButtoes.add(btnExcluir);
		grupoButtoes.add(btnSair);

		JPanel PainelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
		PainelBotao.add(btnSalvar);
		PainelBotao.add(btnLimpar);
		PainelBotao.add(btnExcluir);
		PainelBotao.add(btnSair);

		painel.add(PainelBotao);

		janela.setVisible(Boolean.TRUE);

		/*------------------------------------------------------------*/

		btnSalvar.addActionListener(new ActionListener() {

			ClienteDAO cli = new ClienteDAO();
			Cliente cliente = new Cliente();
			ArrayList<Cliente> listaCli = new ArrayList<Cliente>();

			@Override
			public void actionPerformed(ActionEvent e) {

				String nome = campoNome.getText().trim();
				String email = campoEmail.getText().trim();
				String curso = campoCurso.getText().trim();
				// int idade = Integer.parseInt(campoIdade.getText().trim());

				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(janela, "Por favor, preencha o campo Nome.", "Campo Obrigatório",
							JOptionPane.ERROR_MESSAGE);

					return;
				} else if (email.isEmpty() || !email.contains("@")) {
					if (email.isEmpty()) {
						JOptionPane.showMessageDialog(janela, "Por favor, preencha o campo email.", "Campo Obrigatório",
								JOptionPane.ERROR_MESSAGE);

						return;
					} else {
						JOptionPane.showMessageDialog(janela, "Por favor, não se esqueça de inserir @.",
								"Campo Obrigatório", JOptionPane.ERROR_MESSAGE);
						return;
					}
				} else if (curso.isEmpty()) {
					JOptionPane.showMessageDialog(janela, "Por favor, preencha o campo curso.", "Campo Obrigatório",
							JOptionPane.ERROR_MESSAGE);

					return;
				}

				try {

					cliente.setNome_Cliente(campoNome.getText());
					cliente.setEmail_Cliente(campoEmail.getText());
					cliente.setCurso(campoCurso.getText());
					cliente.setDataNascimento_Cliente(campoDataNascimento.getText());
					cliente.setIdade(Integer.parseInt(campoIdade.getText()));

					if (btnSim.isSelected()) {
						cliente.setPCD(true);
					} else {
						cliente.setPCD(false);
					}

					String rendaSelecionada = (String) btn.getSelectedItem();
					cliente.setRenda_Clente(rendaSelecionada);

					cli.salvarCliente(cliente);
					listaCli.add(cliente);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				campoNome.setText("");
				campoEmail.setText("");
				campoCurso.setText("");
				campoIdade.setText("");
				campoDataNascimento.setText("");
				btnSim.setSelected(false);
				btnNao.setSelected(false);
				btn.setSelectedIndex(0);

			}
		});

		btnExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					JFrame janela = new JFrame("Senac - Signup - Cliente");
					janela.setSize(650, 360);
					janela.getContentPane().setBackground(new Color(248, 248, 250));
					janela.setLocation(327, 227);
					janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					janela.setResizable(false);

					JPanel painel = new JPanel();
					janela.add(painel);
					janela.setContentPane(painel);

					GridLayout layout = new GridLayout(8, 2, 6, 6);
					painel.setLayout(layout);

					janela.setContentPane(painel);

					/*------------------------------------------------------------*/

					JLabel rotuloExc = new JLabel("Código do Cliente : ", JLabel.LEFT);
					rotuloIdade.setVisible(Boolean.TRUE);

					JTextField campoCod = new JTextField(JTextField.CENTER);
					campoCod.setVisible(true);

					painel.add(rotuloExc);
					painel.add(campoCod);

					/*------------------------------------------------------------*/

					ButtonGroup grupoButtoes = new ButtonGroup();

					JButton btnExcluir2 = new JButton("Excluir");
					JButton btnSair2 = new JButton("Sair");

					grupoButtoes.add(btnExcluir2);
					grupoButtoes.add(btnSair2);

					JPanel PainelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));

					PainelBotao.add(btnExcluir2);
					PainelBotao.add(btnSair2);

					painel.add(PainelBotao);

					janela.setVisible(Boolean.TRUE);

					/*------------------------------------------------------------*/

					btnExcluir2.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {

							int id = Integer.parseInt(campoCod.getText());

							ClienteDAO clienteCod = new ClienteDAO();

							try {
								clienteCod.deletarCliente(id);
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					
					btnSair2.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							System.exit(0);

						}
					});

				} catch (Exception e1) {

					e1.printStackTrace();
				}

			}
		});

		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

}
