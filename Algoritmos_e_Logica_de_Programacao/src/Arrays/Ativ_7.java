package Arrays;

public class Ativ_7 {

	public static void main(String[] args) {
		
		int soma = 2;
		
		int [] v1;
		
		v1 = new int[100];
		
		for (int i = 0; i < v1.length;i++) {
		      v1[i] = soma;
			soma = soma + 2;
		}
			
		for (int i = 0; i < v1.length;i++) {
			System.out.println(v1[i]);
		}
	
	}
}


