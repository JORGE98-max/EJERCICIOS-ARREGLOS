import java.util.Scanner;

public class EjerciciosARREGLOS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[4];
		double sum, prom;

		sum = 0;
		prom = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println("Ingrese numero " + (i + 1));
			num[i] = scan.nextInt();

			sum = sum + num[i];

		}

		prom = sum / 4;

		System.out.println("PROMEDIO :" + prom);
	}

}
