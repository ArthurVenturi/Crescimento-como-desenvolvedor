package Senac.SignUpV2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Senac.SignUpV2.Connection.MySQLConnection;
import Senac.SignUpV2.Model.Cliente;

public class ClienteDAO {

	public void salvarCliente(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO SignUp_ClienteV2(Nome_Cliente, Email_Cliente, Curso_Cliente, PCD, Idade, DataNascimento_Cliente,Renda_Cliente) VALUES(?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			// Cria uma conexao com o banco
			conn = MySQLConnection.createConnectionToMySQL();
			// Cria um preparedStatment, classe usada para executar a query
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome_Cliente());
			pstm.setString(2, cliente.getEmail_Cliente());
			pstm.setString(3, cliente.getCurso());
			pstm.setBoolean(4, cliente.getPCD());
			pstm.setInt(5, cliente.getIdade());
			pstm.setString(6, cliente.getDataNascimento_Cliente());
			pstm.setString(7, cliente.getRenda_Clente());
			// Executa o sql para a inserção dos dados
			pstm.execute();
			
			JOptionPane.showMessageDialog(null, "Cliente inserido!", "SignUp_Senac",
					JOptionPane.ERROR_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Cliente não inserido!", "SignUp_Senac",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} finally {
			pstm.close();
			conn.close();
		}

	}

	public void deletarCliente(int id) throws SQLException {

		String sql = "DELETE FROM SignUp_ClienteV2 where Codigo_Cliente = ? ";

		Connection conn = null;
		PreparedStatement pstm = null;

		int opcao = JOptionPane.showConfirmDialog(null, "Você realmente quer excluir o Cliente",
				"SignUp_Senac", JOptionPane.YES_NO_OPTION);

		if (opcao == 0) {

			try {
				
				conn = MySQLConnection.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, id);
				pstm.execute();
				
				JOptionPane.showMessageDialog(null, "Cliente Excluido!", "SignUp_Senac",
						JOptionPane.ERROR_MESSAGE);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Cliente nao encontrado!", "SignUp_Senac",
						JOptionPane.ERROR_MESSAGE);
				
				e.printStackTrace();
			} finally {
				pstm.close();
				conn.close();
			}

		}
		else {
			return;
		}

	}

//	public void updateCliente(Cliente cliente) throws SQLException {
//		
//	}

}
