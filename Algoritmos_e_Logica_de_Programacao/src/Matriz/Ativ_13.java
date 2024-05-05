package Matriz;
import java.util.Random;
public class Ativ_13 {

	public static void main(String[] args) {
		
		int [][] m1 = new int [3][3];
		int [][] m2 = new int [3][3];
		
		int numero = 0;
		int quantidade = 0;
		
		System.out.println("Primeira matriz");
		
		for (int i=0; i<m1.length;i++) {
			for(int j=0; j < m1[i].length;j++) {
				m1 [i][j] = new Random().nextInt(5);
				
				System.out.print(m1[i][j]+ " ");
			}
			System.out.println();			
		}
		System.out.println("");
		System.out.println("Segunda matriz");
		
		for (int k=0; k<m2.length;k++) {
			for(int l=0; l < m2[k].length;l++) {
				m2 [k][l] = new Random().nextInt(5);
				
				System.out.print(m2[k][l]+ " ");	
			}
			System.out.println();
		}
		
		for (int i=0; i<m1.length;i++) {
			for(int j=0; j < m1[i].length;j++) {
				
				numero = m1[i][j];
				
				for (int k=0; k <m2.length;k++) {
					for(int l=0; l < m2[i].length;l++) {
						
						if (m2[k][l] == numero) {
							quantidade++;
						}	
						
					}
				}
			}
			
		}	
					
		
	}

}
