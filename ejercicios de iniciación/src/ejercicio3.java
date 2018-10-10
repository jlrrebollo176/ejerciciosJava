import java.util.Scanner;

public class ejercicio3 {
public static void main(String[] args) {
	double calificacionesParciales;
	float calificacionExamenFinal;
	float calificacionTrabajoFinal;
	int nota1,nota2,nota3;
	double total;
	double a;
	double b;
	
	
	
	Scanner teclado =  new Scanner (System.in);
	System.out.println("introduce 1 nota");
	nota1=teclado.nextInt();
	System.out.println("introduce 2 nota");
	nota2=teclado.nextInt();
	System.out.println("introduce 3 nota");
	nota3=teclado.nextInt();
	calificacionesParciales=(nota1+nota2+nota3)/3*1.55;
	System.out.println(calificacionesParciales);
	
	
	System.out.println("introduce calificacion examen final");
	calificacionExamenFinal = teclado.nextFloat();
	a=calificacionExamenFinal*1.30;
	System.out.println("introduce calificacion trabajo final");
	
	calificacionTrabajoFinal = teclado.nextFloat();
	b=calificacionTrabajoFinal*1.15;
	total=(calificacionesParciales+a+b)/3;
	System.out.println(total);
}

}