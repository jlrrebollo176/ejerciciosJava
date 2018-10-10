import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldo;
		double comision;
	    double total;
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce sueldo ");
		sueldo=sc.nextDouble();
		comision=1.10*3;
		total=(sueldo*1.10)*3;//total
		System.out.println(" comision 3 meses : "+comision+" total sueldo:"+total);
	}

}
