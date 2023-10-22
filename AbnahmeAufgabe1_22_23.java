package sur;

public class AbnahmeAufgabe1_22_23 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int anzahlSpalte = 2*n - 1 ;
		
		System.out.println("Anzahl der (Baum-)Zeilen:" +  n);
		
		for(int i = 0 ; i < n -1 ; i++)
			System.out.print(" ");
		         System.out.println("X");
		         
		         for(int i = n ;  i >= 0  ; i--)
		         {
		        	 for(int j = 0 ; j < anzahlSpalte-i   ; j++)
		        	 {
		        		 if(j < i)
		        		 {
		        		
		        			 if((i < n  &&   i % 2 != 0  &&  i == j+1))
			        		   {
			        			 System.out.print("i");
			        		   }
		        			 else
		        			 {
		        		 
		        			  System.out.print(" ");
		        			 }
		        			 
		        		 }
		        		
		        		 else
		        		 {
		        			 System.out.print("*");
		        		 }
		        	 }
		        	 if(i<n && i%2 != 0 )
		        		 System.out.print("i");
		        	 System.out.println();
		         }
		         
		         for(int i = 0 ; i < n -1 ; i++)
		 			System.out.print(" ");
		 		         System.out.println("I");
	}

}
