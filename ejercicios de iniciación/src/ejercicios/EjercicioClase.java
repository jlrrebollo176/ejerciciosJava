package ejercicios;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
	
		System.out.println("Introduce lado a");
		Scanner teclado;

		teclado = new Scanner(System.in);
		float a = teclado.nextFloat();
		System.out.println("Introduce lado b");
		float b= teclado.nextFloat();
		System.out.println("introduce lado c");
		float c=teclado.nextFloat();
		if (a<b+c && b<a+c && c<b+a) 
			System.out.println("Es un triangulo");
		else 
			System.out.println("No es un triangulo");
		
		
	}
	
}