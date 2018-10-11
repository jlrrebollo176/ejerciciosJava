import java.util.Random;
import java.util.Scanner;



public class CompararNumeros {

public static void main(String[] args) {
		

		
		Random r=new Random(System.nanoTime());
		int n1=r.nextInt(1000);
		int n2=r.nextInt(1000);
	
		System.out.println("introduce n1 "+n1);
		System.out.println("introduce n2 "+n2);
		if(n1>n2) {
			System.out.println(" el mayor es "+n1);
			
		}	
	    else {
	    	if(n2>n1) {
			System.out.println(" el mayor es "+n2);
	    	} else {
		System.out.println("son iguales ");
	}
	    }
		/*
		 * int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce n1");
		n1=sc.nextInt();
		System.out.println("introduce n1");
		n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println(" el mayor es "+n1);
			
		
	    }else {
		System.out.println(" el mayor es "+n1);
	}

}
*/
}
		

}
