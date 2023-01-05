package patika;
import java.util.Scanner;
public class PrimeNumberFinder {

	public static void main(String[]args) {
		//100'e kadar olan asal sayılar: 2-3-5-7... sadece kendisine ve 1'e bölünen sayılar 
		// counter lazım bi tane 100e kadar gidecek
		//counterdan gecen sayıları ayıklayacak bi dongu lazim
    	//int number = 1; 
		 System.out.print(2  + " , "  );
		 for (int i = 2 ; i <= 100 ; i++) {
		   	 
		   	boolean isPrime = true ;
		   	for ( int k = 2 ; k <= i ; k++) {
		   		if (i % k  == 0 ) {
		   			isPrime = false ;
		   			break;
		   			
		   		}
		   		
		   		//sadece kendisine ve 1e bölündügünü buldurmamız lazım
		   		System.out.print(i  + " , ");
		   	}		  
	
	 
	
	
	
		 }
	}
}
