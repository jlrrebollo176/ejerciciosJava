import java.util.Scanner;

public class ejercicio4 {
	


	
	
	
	public void menu() {
		System.out.println("---menu--- ");
        System.out.println("1.Ginicologia ");
		System.out.println("2.Traumatologia  ");
		System.out.println("3.Pediatria ");
	}

	public static void main(String[] args) {
		ejercicio4 e=new ejercicio4 ();
		e.menu();
		
		double Ginicologia;
		double Traumatologia;
		double Pediatria;
		int presupuesto;
		Scanner sc=new Scanner(System.in);
		int opcion =sc.nextInt();
		switch(opcion) {
		
		case 1:
			System.out.println("introduce presupuesto ");
			presupuesto=sc.nextInt();
			Ginicologia=presupuesto*1.40;
			System.out.println("total :"+Ginicologia);
			
			break;
		case 2:
			System.out.println("introduce presupuesto ");
			presupuesto=sc.nextInt();
			Traumatologia=presupuesto*1.30;
			System.out.println("total :"+Traumatologia);
			break;
		case 3:
			System.out.println("introduce presupuesto ");
			presupuesto=sc.nextInt();
			Pediatria=presupuesto*1.30;
			System.out.println("total :"+Pediatria);
			break;
		}
	
			
		
		
}
}
