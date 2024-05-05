package Arrays;
import java.util.Random;
public class Arrays {

	public static void main(String[] args) {
		int [] v1; // Declara

        v1 = new int[5]; // Inicializa o tamanho

        v1 [2] = 90;
        v1 [4] = -5;

        System.out.println(v1[0]);
        System.out.println(v1[1]);
        System.out.println(v1[2]);
        System.out.println(v1[3]);
        System.out.println(v1[4]);

        System.out.println("****************************");

        for (int i = 0; i < v1.length; i++) { // Popula
            v1[i] = new Random().nextInt(10);
        }

        for (int i = 0; i < v1.length; i++) { // Popula
            System.out.println(v1[i]);
        }

        System.out.println("****************************");

        int i = 0;
        while ( i < v1.length) { // Equivalente ao primeiro for // Popula
            v1[i] = new Random().nextInt(10);
            i++;
        }

        i = 0;
        while (i < v1.length) { // Equivalente ao segundo for // Escreve
            System.out.println(v1[i]);
            i++;
        }

	}

}
