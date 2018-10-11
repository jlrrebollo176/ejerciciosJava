package ejercicios;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int z;
 int par;
 int impar;
 
 Scanner sc=new Scanner(System.in);
 System.out.println("introduce un numero");
 z=sc.nextInt();
     if(z%2==0) {
    	 par=z;
    	 System.out.println("PAR :"+par);
	 
 }else {
	 impar=z;
	 System.out.println("IMPAR :"+impar);
 }
     
	}

}
