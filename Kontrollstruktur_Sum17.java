package prog2;

public class Kontrollstruktur_Sum17 {

	public static void main(String[] args) {
		
		 int eingabe1 = Integer.parseInt(args [0]);
		 int eingabe2 = Integer.parseInt(args [1]);
		 
		 int sum = 0 ;
		 int  diviseur = 17 ;
		
		 int  container = 0 ;
		 while(eingabe1 <=  eingabe2)
		 {
			 
			 if(eingabe1 > diviseur )
			 {
				 
				 int tmp = eingabe1 ;
				
				
				 while(tmp > 0)
					 
				 {
					
					 tmp =  tmp - diviseur ;
					 
					 if(tmp == 0)
					 {
						 
						 container =  eingabe1;
						 if(container < container + 17)
						
						 System.out.print(container+ " +");
						 else 
							 System.out.print(container+ "  "); 
						 
						 sum = sum + container ;
					 }
					 
					 
				
				
					 
				 }
				
				
			 }
			 eingabe1++ ;
			 
			
			 
			  
		 }
		 System.out.print("=" +sum);

	}

}
