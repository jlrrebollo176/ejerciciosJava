package ejercicios;

import java.util.Scanner;

public class iva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  float precio = 0;
  Scanner sc=new Scanner(System.in);
  System.out.println("tipo iva  (0) 7% (1) 10% (2) 21% ");
  int tipoIva=sc.nextInt();
  float iva = 0;
if(tipoIva==0) {
	iva=0.07f;
	
}else if(tipoIva==1){
		iva=0.1f;
		
	}else if(tipoIva==2) {
		iva=0.21f;
		
}else {
	 System.out.println("el iva no es corecto");
}if(tipoIva!=0) {
	double totalIva=precio*iva;
	double total=precio+totalIva;
}

	
sc.close();
	}

}
