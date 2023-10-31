package sur;

public class ueb1blatt3 {

	public static void main(String[] args) {
		
		 int eingabe1 = Integer.parseInt(args [0]);
		 int eingabe2 = Integer.parseInt(args [1]);
		 
		 int mult= 1 ;
		 int  diviseur = 23 ;
		
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
						 if(container < eingabe2 -23)                                // ici c etai pour jouer entre le signe qui est entre les element 
						
						 System.out.print(container+ " * ");
						 else 
							 System.out.print(container+ "  ");                       
						 
						 mult *=  container ;
					 }
					 
					 
				
				
					 
				 }
				
				
			 }
			 eingabe1++ ;
			 
			
			 
			  
		 }
		 System.out.print(" = " +mult);

	}



	}


