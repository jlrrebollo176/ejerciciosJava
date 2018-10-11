package ejercicios;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int divisible;
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("introduce un numero");
		 x=sc.nextInt();
		 System.out.println("introduce un numero");
		 y=sc.nextInt();
		 divisible=x+y;
		 if(divisible%2==0) {
			 //int resultado=divisible/2;
			 int par=divisible%2;
			 System.out.println(divisible);
			 
			 
		 }
		 
		 

	}

}
