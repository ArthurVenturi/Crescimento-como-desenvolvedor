package Arrays;
import java.util.Random;
public class Declaração_arrays {

	public static void main(String[] args) {
		
		int i=0;
		
		int []  v1;
		
		long [] v2;
		
		String [] v3;
		
		boolean [] v4;
		
		float [] v5;
		
		byte [] v6;
		
		v1 = new int [5];
		v2 = new long [5];
		v3 = new String [5];
		v4 = new boolean [5];
		
		v6 = new byte [5];
		
		
		for (i = 0; i <v1.length; i++) {
			
		}
		
		
		for (i = 0; i<v1.length; i++) {
			v1[i] = new Random().nextInt(10);
		}
		
		for (i = 0; i<v1.length;i++) {
			System.out.println(v1[i]);
		}
		
	}

}
