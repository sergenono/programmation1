package prog2;

 
public class Kontrollstruktur_Primzahl {

	public static void main(String[] args) {
		int n  = Integer.parseInt(args[0]);
		
		int counter0  = 0 ;
		
		int counter3 = 0 ;
		
		int tmp = 0;
		
		int tmp2 = 1 ;
		
		int abs ;
		
		int maxAbs  = 0;

		int recup = 0 ;
		int  recup2 = 0;
		
		 
		
		for(int i = 2 ;  i < n  ; i++)
		{
			int counter1 = 0 ;
			
			for(int j = 1 ;  j <= i ;  j++)
			{
				if(i % j == 0)
				{
					counter1 = counter1 + 1 ;
					
				}
				
					
			}
			if(counter1 == 2)
			{
				 counter0 = counter0 + 1 ;
				 
				 tmp = i ;
				 
				
			  //System.out.print(tmp + "  ");
				
			}
			
			abs = tmp - tmp2;
			
			if(abs == 2 )
			{
				
			  counter3 = counter3 + 1 ;
			
			}
			   
			 if(maxAbs < abs)
			 {
				 maxAbs =  abs ;
				
			 }

			if(maxAbs == abs  && (tmp + tmp2) < n)
			{
				recup = tmp ;
				recup2 = tmp2;
			}
			
			 tmp2 = tmp ;
			
			
			
			
		}
		System.out.println(counter0 );
		System.out.println(counter3);
		System.out.println(maxAbs);

	}

}
