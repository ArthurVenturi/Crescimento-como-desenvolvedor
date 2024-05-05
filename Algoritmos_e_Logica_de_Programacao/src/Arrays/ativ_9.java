package Arrays;
import java.util.Random;
public class ativ_9 {

	public static void main(String[] args) {
		
		/*int [] v1  = {3, 2, 4, 5, -6};
		
		for (int i = 0; i <v1.length;i++) {
			
			System.out.println(v1[i] +"="+ (v1[i]*v1[i]));
			
		}*/
		
		//----------------------------------------------------------//
		
		int [] v1 = new int [5];
		
		for(int i=0; i <v1.length; i++) {
			v1[i] = new Random().nextInt(10);
		}
		
		/*for (int i =0; i <v1.length; i++) {
			
			System.out.println(v1[i] +" = "+ (v1[i]*v1[i]));
		}*/
		
		int i = 0;
		
			while(i<v1.length) {
				System.out.println(v1[i] +" = "+ (v1[i]*v1[i]));
				i++;
				
			}
		
	}

}
