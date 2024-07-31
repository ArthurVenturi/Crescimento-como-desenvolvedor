package aula_03;

import java.util.Scanner;

public class aula03_exer {

	public static void main(String[] args) {

		/*
		 * Trabalho Faça um programa em Java que leia o nome, a idade e o sexo (‘M’ para
		 * masculino e ‘F’ para feminino) de um grupo de 20 estudantes e determine? a)
		 * quantos são do sexo feminino e maior de 21 anos; b) quantos são do sexo
		 * masculino e maio de 18 anos c) qual a média de idade de pessoas do sexo
		 * masculino; d) qual a média de idade de pessoas do sexo feminino;
		 */

		int intidade = 0, intalunos = 0, intquantidademasc = 0, intquantidadefem = 0, intmasculinomaior21 = 0,
				intfemininomaior21 = 0;
		double dbmediaidadetotal = 0, charmasculino = 0, charfeminino = 0, dbtotalidade = 0, dbmediatotalmasc = 0,
				dbmediatotalfem = 0;

		char charrespostasexo;

		String stringnome;

		Scanner idade = new Scanner(System.in);

		System.out.println("Determine a quantidade de alunos");

		intalunos = idade.nextInt();

		for (int i = 1; i <= intalunos; i++) {
			System.out.println("Insira o nome do aluno " + i);
			stringnome = idade.next();

			System.out.println("Insira a idade do aluno " + i);
			intidade = idade.nextInt();

			System.out.println("Insira o sexo do aluno " + i);
			System.out.println("M ou m para Masculino enquanto F ou f para feminino");
			charrespostasexo = idade.next().charAt(0);

			dbtotalidade += intidade;

			if (charrespostasexo == 'F' || charrespostasexo == 'f') {

				charmasculino = charmasculino + intidade;
				intquantidademasc++;

				if (intidade > 21) {
					++intfemininomaior21;
				}
			}

			else if (charrespostasexo == 'M' || charrespostasexo == 'm') {

				charfeminino += intidade;
				intquantidadefem++;

				if (intidade > 18) {
					++intmasculinomaior21;
				}
			}
		}
		dbmediaidadetotal = dbtotalidade / intalunos;

		dbmediatotalmasc = charmasculino / intquantidademasc;

		dbmediatotalfem = charfeminino / intquantidadefem;

		System.out.println("A média de idade de todos os alunos " + dbmediaidadetotal);
		System.out.println("");// espaço entre as linhas
		System.out.println("A quantidade de alunos de sexo masculino maiores de 21 anos são " + intmasculinomaior21);
		System.out.println("");// espaço entre as linhas
		System.out.println("A média de idade de pessoas do sexo feminino " + dbmediatotalfem);
		System.out.println("");// espaço entre as linhas
		System.out.println("A quantidade de alunos de sexo feminino maiores de 18 anos são " + intfemininomaior21);
		System.out.println("");// espaço entre as linhas
		System.out.println("A média de pessoas do sexo masculino " + dbmediatotalmasc);

		idade.close();
	}
}
