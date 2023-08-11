package prog2;

public class Kontrollstruktur_PerfektZahl {

	public static void main(String[] args) {
		
		int n  =  Integer.parseInt(args[0]);
		int sum  = 0 ;

		 
		int i = n -1   ;
		
		
			while(i >= 1)
			{
				if(n % i == 0)
				{
					
				   sum = sum + i;
				   
					//System.out.print(i + " + ");
				}
				
				
				i-- ;
			
			}
			
			if(sum == n)
			{
			System.out.print(sum +  " = ");
			
			int j = n -1   ;
			
			while(j >= 1)
			{
				if(n % j == 0)
				{
					if(j > 1)
					{
				   System.out.print(j + " + ");
					}
					else 
					{
						System.out.print(j + "  ");
					}
						
				}
				
				
				j-- ;
			
			}
			
			
			}
			else 
			{
				System.out.println("kein perfekt zahlen");
			}
			
			
		
			
		
		
		
			
			
		
		
		
		
		
		  /*for(int i = n -1 ; i >= 1 ;  i--)
		  {
			  if(n % i == 0 )
			  {
				  
				  sum =  sum + i ;
				  
				  
				  //System.out.print(i + "  ");
				  
				  
			  }
			 
		  }
		  System.out.print(sum + "=");*/
		  
		  
	}

}
