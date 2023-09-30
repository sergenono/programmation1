package prog2;

public class Kontrollsstruktur_Ahnahme1_subtraktion {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a - b ;        // c = a -b
		int diviseur = 10 ;
		int rest0  ;
		int rest00;
		int result1 = a ;
		int result2 = b ;
		
		int rest1 = 0 ;
		int rest2 = 0;
		int rest3 = 0 ;
		int rest4 = 0 ;
		int eingabe1 = a;
		int eingabe2 = b ;
		int counter1 = 0 ;
		int counter2 = 0;
		int counter3 = 0 ;
		
		
		if(a >= 100 && a <= 999 && b >= 100 && b <= 999 )
		{

			
			
			
			while(result1 != 0)
				
			{
				result1 = eingabe1 / diviseur ;
				rest0 = eingabe1 % diviseur ;
				
				
					eingabe1 =  result1 ;
					
					rest1 =  rest0 ;
					
					if(rest2 !=  rest1)
					{
					//rest2 =  rest1 ;
					
					counter1 = counter1 + 1 ;
					}
					else 
					{
						System.out.println("false Eingabe : dobelte ziffern in eingabe");
					}
					
					rest2 =  rest1 ;
			}
			
	while(result2 != 0)
				
			{
				result2 = eingabe2 / diviseur ;
				rest00 = eingabe2 % diviseur ;
				
				
					eingabe2 =  result2 ;
					
					rest3 =  rest00 ;
					if(rest4 !=  rest3)
					{
					rest4 =  rest3 ;
					//System.out.println(a);
					counter2 = counter2 + 1 ;
					}
					else 
					{
						System.out.println("false Eingabe : dobelte ziffern in eingabe");
					}
					
				
			}
			
			if(counter1 == 3 && counter2 == 3)
			{
				
				c = a-b  ;
				int result3 = c;
				int eingabe3 = c ;
				int rest000  = 0 ;
				int rest5 = 0 ;
				int rest6 = 0;
				
				
				
				
				
				while(result3 != 0)
				{
					result3 = eingabe3 / 10 ;
					rest000 = eingabe3 % 10  ;
					eingabe3 =  result3 ;
					rest5 = rest000 ;
					
					if(rest6 != rest5)
					{
						rest6 =  rest5 ;
						counter3 =  counter3 + 1 ;
					}
					else 
					{
						System.out.println("false Eingabe : dobelte ziffern in eingabe");
					}
					
				}
				/*System.out.println(a);
				System.out.println(b);
				System.out.println(c);*/
			}
			if(counter3 == 3)
			{
				System.out.println(c);
			}
			
			
		}
		else
		{
			System.out.println("false Eingabe");
		}
		

	}
	
	

}
