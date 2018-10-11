import java.util.Scanner;

public class ejercicio5 {
	
	
	
	

	public static void main(String[] args) {
		float matematicas;
		float examenMatematicas;
		float ejerciciosMatematicas;
		float tarea1Matematicas;
		float tarea2Matematicas;
		float tarea3Matematicas;
		float fisica;
		float examenFisica;
		float tarea1Fisica;
		float tarea2Fisica;
		float notaTareasMatematicas;
		float notaTareasFisica;
		float notaTareasQuimica;
		float tarea1Quimica;
		float tarea2Quimica;
		float tarea3Quimica = 0;
		float examenQuimica;
		float quimica;
		float NotaFinal;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" introduce nota examen de matematicas");
		examenMatematicas=teclado.nextFloat();
		System.out.println("introduce nota tarea 1 de Matematicas");
		tarea1Matematicas=teclado.nextFloat();
		System.out.println("introduce tarea 2 de Matematicas");	
		tarea2Matematicas=teclado.nextFloat();
		System.out.println("introduce tarea 3 Matematicas");
		tarea3Matematicas=teclado.nextFloat();
		
		notaTareasMatematicas = (tarea1Matematicas + tarea2Matematicas + tarea3Matematicas)/3;
		System.out.println("Nota en las tareas:" + notaTareasMatematicas);
		matematicas = (float) (examenMatematicas * 0.9 + notaTareasMatematicas * 0.1);
		System.out.println("Nota matematicas:" + matematicas);
		
		System.out.println("introduce nota examen de fisica");
		examenFisica=teclado.nextFloat();
		System.out.println("introduce tarea1 fisica");
		tarea1Fisica=teclado.nextFloat();
		System.out.println("introduce tarea 2 fisica");
		tarea2Fisica=teclado.nextFloat();
	
		notaTareasFisica = (tarea1Fisica + tarea2Fisica)/2;
		fisica = (float) (examenFisica * 0.8 +notaTareasFisica * 0.2);
		System.out.println("Nota en las tareas:" + notaTareasFisica);
		System.out.println("Nota Fisica:" + fisica);
		
		System.out.println("introduce nota examen de Quimica");
		examenQuimica=teclado.nextFloat();
		System.out.println("introduce tarea1 Quimica");
		tarea1Quimica=teclado.nextFloat();
		System.out.println("introduce tarea 2 Quimica");
		tarea2Quimica=teclado.nextFloat();
		System.out.println("introduce tarea 3 Quimica");
		tarea3Quimica=teclado.nextFloat();
		
		notaTareasQuimica = (tarea1Quimica + tarea2Quimica + tarea3Quimica)/3;
		System.out.println("Nota en las tareas:" + notaTareasQuimica);
		quimica = (float) (examenQuimica * 0.85 + notaTareasQuimica * 0.15);
		System.out.println("Nota Quimica:" + quimica);
		
		NotaFinal = (quimica + matematicas + fisica)/3;
		System.out.println("Nota final:" + NotaFinal);
		
	}
	
	
	
}
