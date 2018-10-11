import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   float sueldo=1200;
	   final float porcentaje=0.1f;
	   float comision;
	   float venta=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("introduce valor venta");
		venta=sc.nextFloat();
    	comision=venta*porcentaje;
    	sueldo+=comision;
   
    	System.out.println("introduce valor venta");
    	venta=sc.nextFloat();
    	comision=venta*porcentaje;
    	sueldo+=comision;
    	
    	System.out.println("introduce valor venta");
    	venta=sc.nextFloat();
    	comision=venta*porcentaje;
    	sueldo+=comision;
    	
		System.out.println(sueldo);
	}

}
