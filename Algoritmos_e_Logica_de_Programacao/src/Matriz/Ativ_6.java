package Matriz;

public class Ativ_6 {

	public static void main(String[] args) {
		
		int [] [] matriz = new int [3] [3];
		int impar = 2;
		for (int i =0; i <matriz.length;i++) {
			
			for (int j =0; j <matriz[i].length;j++) {
			
				matriz[i][j] = 1;
				impar++;
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
