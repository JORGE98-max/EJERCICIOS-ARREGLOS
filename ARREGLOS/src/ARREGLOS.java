
import java.util.Scanner;

public class ARREGLOS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// L I T E R A L   :)
		
		//int[]numeros= {6,42,3,7};
		//int sum = 0;
		//for(int x = 0; x<numeros.length;x++) {
			
		//	sum = sum + numeros[x];
		//}
		//System.out.println(sum);
		
//		
//		int[]arreglo = new int [5];
//		arreglo[0] = 15;
//		arreglo[1] = 25;
//		arreglo[2] = 35;
//		arreglo[3] = 45;
//		arreglo[4] = 55;
//		System.out.println(arreglo[4]);
//		
//		
//		
//		// MULTIPLES MATRICES
//		
//		int[][] sample = {{1,2,3}, {4,5,6}};
//		int x = sample[1][0];
//		System.out.println(x);
//		
//		
//		
//		// MOSTRAR TODOS LOS NUMEROS
//		
//		int[] primos = {2,3,5,7};
//		
//		//  APLICANDO EL FOREACH
//		
//		for(int t: primos) {
//		
//			System.out.println(t);
//		}
		
		int [] numeros = new int [5];
		
		for (int c = 0; c < 5; c++) {
		
			System.out.println("numeros ["+c+"]"+numeros[c]);
		}
		
		String[] nombres = new String[4];
		
		nombres[0] = "CARLOS";
		nombres[1] = "SEBASTIAN";
		nombres[2] = "MATEO";
		nombres[3] = "GEORGE";
		
		System.out.println(nombres[3]);
		
	}

}
