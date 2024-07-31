package aula_08;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		/*
		 * int vetor1 [] = new int[3]; int [] vetor2 = new int [3];
		 * 
		 * int [] vetor3 = new int [] {1,2,3}; int vetor4[] = new int[] {4,5,6};
		 * 
		 * 
		 * System.out.println(vetor1.length);
		 * 
		 * System.out.println(vetor3);
		 */

		/*----------------------------------------------------------------------------------------------------------------------------*/
		/*
		 * 
		 * Aluno Turma [] = new Aluno[5];
		 * 
		 * for(int i = 0; i < Turma.length; i++) {
		 * 
		 * String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno",
		 * "Aula prática", JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,
		 * "Informe a primeira nota do aluno", "Aula prática",
		 * JOptionPane.INFORMATION_MESSAGE));
		 * 
		 * double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,
		 * "Informe a segunda nota do aluno", "Aula prática",
		 * JOptionPane.INFORMATION_MESSAGE));
		 * 
		 * Turma[i] = new Aluno(nome, nota1, nota2);
		 * 
		 * }
		 * 
		 * for (int i = 0; i < Turma.length; i++) {
		 * 
		 * JOptionPane.showMessageDialog(null, "Nome do Aluno : " +
		 * Turma[i].getNome() + "\n" + "Média : " + Turma[i].calcularMedia() ,
		 * "Aula prática", JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * }
		 * 
		 * 
		 * /*---------------------------------------------------------------------------
		 * --------------------------------------------------------------
		 */

		// 7)
		ArrayList<String> listaCarro = new ArrayList<String>();
		// 7.1)
		System.out.println(listaCarro);
		// 7.2)
		System.out.println(listaCarro.size());
		// 7.3)
		listaCarro.add("Gol");
		listaCarro.add("Polo");
		listaCarro.add("HRV");

		System.out.println(listaCarro);
		System.out.println(listaCarro.size());
		// 7.4)
		listaCarro.add("Toro");
		listaCarro.add("Fusca");
		System.out.println(listaCarro);

		// 7.5)
		listaCarro.add(1, "Cruze");
		System.out.println(listaCarro);
		// 7.6)
		System.out.println(listaCarro.get(2));
		// 7.7)
		String test = listaCarro.get(0);
		System.out.println("teste: " + test);
		// 7.8)
		for (String i : listaCarro) {

			System.out.println(i);

		}

		// 7.9)
		listaCarro.add(0, "Ferrari");

		// 7.10)
		listaCarro.set(0, "Ferrari 365");

		// 7.11)
		listaCarro.remove(0);
		System.out.println(listaCarro.remove(0));

		String retirado = listaCarro.remove(0);

		// 7.12)

		listaCarro.remove("Toro");

		listaCarro.remove("Onix");

		/*--------------------------------------------------------------------------------------------*/

		// 8.1)
		ArrayList<Conta> listaConta = new ArrayList<Conta>();

		// 8.2)
		Conta conta1 = new Conta(1519, 100.00);
		Conta conta2 = new Conta(1519, 100.00);
		// 8.3) compara o endereço de memória.
		if (conta1 == conta2) {
			System.out.println("Objetos Iguais");
		} 
		else {
			System.out.println("Objetos diferentes");
		}

		// 8.6) compara o conteúdo dos objetos após a criação do método eguals; sem ele compara o endereço de memória também.
		if (conta1.equals(conta2)) {
			System.out.println("Objetos Iguais");
		} 
		else {
			System.out.println("Objetos diferentes");
		}
		
		/*------------------------------------------------------------------------------------------------------*/
		//9)
		
		ArrayList<Aluno> Turma = new ArrayList<Aluno>();
		//9.1)
		Turma.add(new Aluno("Ana", 9.0, 9.2));
		Turma.add(new Aluno("Pedro", 6.0, 7.4));
		Turma.add(new Aluno("Marcos", 8.0, 7.4));
		
		//9.2)
		System.out.println(Turma.size());
		//9.3)sem o método string 
		System.out.println(Turma);
		//9.4) agora com o método String
		System.out.println(Turma);
		//9.4.2)
		for (Aluno aluno : Turma) {
			
			System.out.println(aluno.toString());
		}
		
		for (int i = 0; i < Turma.size();i++) {
			
			System.out.println(Turma.get(i).toString());
		}
		//9.5)
		Turma.add(0, new Aluno("João", 2.0, 4.2));
		//9.6)
		System.out.println(Turma.get(0).toString());
		//9.6.1)
		Turma.add(2, new Aluno("al", 4.0, 8.4));
		System.out.println(Turma.get(2).toString());
		//9.7)
		Turma.get(0).setNome("João Paulo");
		
		//9.8)
		Aluno novo_Aluno = new Aluno("luri", 9.0, 9.0);
		Turma.set(Turma.size() -1, novo_Aluno);
		
		for (Aluno aluno : Turma) {
			System.out.println(aluno.toString());
		}
		
		//9.9)
		Turma.remove(3);
		//9.10)
		System.out.println(Turma);
		
		//9.11)
		boolean resultado = Turma.remove("Ana");
		if(resultado) {
			System.out.println("Elemento eliminado na lista");
		}
		else {
			System.out.println("Elemento não encontrado");
		}
		
		//9.12)
		
		Aluno novo_aluno = new Aluno();
		
		novo_aluno.setNome("Ana");
		
		boolean Novo_resultado = Turma.remove(novo_aluno);
		
		for(int i = 0; i < Turma.size(); i++) {
		
			if(Novo_resultado) {
			System.out.println("Elemento eliminado na lista");
			}
			else {
			System.out.println("Elemento não encontrado");
			}
		
		}
		
		
		//9.13)
		Turma.add(new Aluno("Sofia", 9.5, 9.2));
		Turma.add(new Aluno("Antonio", 6.0, 7.4));
		Turma.add(new Aluno("Andre", 8.0, 7.2));
		
		System.out.println(Turma.size());
		System.out.println(Turma);
		
		//9.14)
		int posicao = Turma.indexOf("Antonio");
		System.out.println(posicao);
		
		//9.15)
		
		Aluno buscaAluno = new Aluno("Antonio", 6.0, 7.4);
		
		//9.16)
		Turma.clear();
	}

}
