package Senac.SignUpV2.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

	//Nome do usuário do mysql
	private static final String username = "usuario";

	//Senha do mysql
	private static final String password = "usuario";

	//Dados de caminho, porta e nome do DB que irá ser feita a conexâo
	private static final String database_url = "jdbc:mysql://172.17.20.31:3306/Senac_ads_SignUp";

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // Faz que a Classe seja carregada pela JVM

		//Cria a conexao com o banco de dados
		Connection connection = DriverManager.getConnection(database_url, username, password);

		return connection;
	}

	public static void main(String[] args) throws Exception {

		//Recupera uma conexao com o Banco de Dados
		Connection con = createConnectionToMySQL();
		//Testa se a conexâo é nula
		if (con != null)
		{
			System.out.println("Conexao obtida com sucesso !" + con);
			con.close();
		}

	}

}
