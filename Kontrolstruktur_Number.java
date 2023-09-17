package prog2;

public class Kontrolstruktur_Number {

	public static void main(String[] args) {
	
		
		int numbers =  Integer.parseInt(args[0]);
		int diviseur  = 10 ;
		int rest  ;
		int modulo ;
		int result = 0;
		
	
		for(int i = 1 ;  i <=  numbers ; i++)
		{
			 rest = 0;
			 result  = numbers / diviseur ;
			 modulo = numbers % diviseur ;
			
			if(result  >= rest  ||  result <= rest  )
			{
				numbers = result ;
				rest =  modulo ;
				if(rest == 0)
				{
				System.out.print( " null "  + " ");
				}
				else if(rest == 1)
				{
					System.out.print( " eins " + "  ");
			    }
				else if(rest == 2)
				{
					System.out.print("zwei" + "  ");
				}
				else if(rest == 3)
				{
					System.out.print("drei" + "  ");
				}
				else if(rest == 4)
				{
					System.out.print("vier" + "  ");
				}
				else if(rest == 5)
				{
					System.out.print("fuenf" + "  ");
				}
				else if(rest == 6)
				{
					System.out.print("sech" +"   ");
				}
				else if(rest == 7)
				{
					System.out.print("sieben" + "  ");
				}
				else if(rest == 8)
				{
					System.out.print("acht" + "   ");
				}
				else if(rest == 9)
				{
					System.out.print("neuen" + "  ");
				}
			}
			
			
				
			
			
		}
			
			
		
		//System.out.print(result);
	if(result == 0)
	{
	System.out.print( " null "  + " ");
	}
	else if(result == 1)
	{
		System.out.print( " eins " + "  ");
    }
	else if(result == 2)
	{
		System.out.print("zwei" + "  ");
	}
	else if(result == 3)
	{
		System.out.print("drei" + "  ");
	}
	else if(result == 4)
	{
		System.out.print("vier" + "  ");
	}
	else if(result == 5)
	{
		System.out.print("fuenf" + "  ");
	}
	else if(result == 6)
	{
		System.out.print("sech" +"   ");
	}
	else if(result == 7)
	{
		System.out.print("sieben" + "  ");
	}
	else if(result == 8)
	{
		System.out.print("acht" + "   ");
	}
	else if(result == 9)
	{
		System.out.print("neuen" + "  ");
	}
				

	}
		
}


