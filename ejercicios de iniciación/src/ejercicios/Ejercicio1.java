package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Número de filas:");
		int n = in.nextInt();
		System.out.println("Número de columnas: ");
		int m = in.nextInt();
		for (int i = 0; i < n; i++) {
			if (i == n / 2) {
				for (int j = 0; j < m; j++)
					System.out.print("*");

			} else {
				for (int j = 0; j < m; j++) {

					if (j == m / 2) {
						System.out.print("*");
					} else
						System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}
