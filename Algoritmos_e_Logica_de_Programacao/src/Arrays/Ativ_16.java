package Arrays;

import java.util.Random;

public class Ativ_16 {

	public static void main(String[] args) {
		
		int [] v1 = new int [10];
		
		for(int i=0; i <v1.length; i++) {
			v1[i] = new Random().nextInt(100);
		}
		
		for (int i = 0; i < v1.length; i++) { 
	        
			 System.out.println(v1[i]);
       
		 }
		
	}

}
