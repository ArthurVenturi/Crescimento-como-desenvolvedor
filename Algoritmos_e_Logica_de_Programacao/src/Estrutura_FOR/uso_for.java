package Estrutura_FOR;

public class uso_for {

	public static void main(String[] args) {
		
		for (int i=30;i >=5; i--) {
			System.out.println("Inicio:" +i);
			
			
			if (i==15) {
				continue;
			}
		
			System.out.println("fim:"+i);
		}	
	}

}
