package prog2;

public class ArithmetikUndVariable_Noten {

	public static void main(String[] args) {
		
		double  max  = Double.parseDouble(args[0]);
		
		double a ;
		a = max - 6.1 ;
		
		//double index  = 1.0 ;
		
		double percentMax = 100.0 ;
		
		int hilfPercent = (int)(percentMax - 5);
		
		System.out.printf(" %.1f - %.1f (%.1f - %d%%)%n"  , max , a , percentMax , hilfPercent);
		
		int  i = 2 ;
		int  n = 10 ;
		
		double b = a - 0.1;
		
		double dazwHilfPercent = hilfPercent - 0.1 ;
		
		while(i <= n)
		{
		
			double c ;
			
			int  weiterePercent ;
			 weiterePercent = (int)(dazwHilfPercent -4.9 );
			 
			 if( i % 2 == 0)
			 {
				 c =  b - 6.1 ;
				 
			
				 
				 System.out.printf("%.1f - %.1f (%.1f - %d%%)%n", b , c ,dazwHilfPercent , weiterePercent);
				 
				 b = c - 0.1 ;
			 }
			 else 
			 {
				
				 c = b - 6.0 ;
				 
				
				 
				 System.out.printf("%.1f - %.1f (%.1f - %d%%)%n", b , c ,dazwHilfPercent , weiterePercent);
				 
				 b = c - 0.1 ;
				 
				
			 }
			 
			 dazwHilfPercent =  weiterePercent - 0.1 ;
			 i++ ;
			
		}
		 System.out.println("weniger als 61.5 punkte");
		
	}

}
