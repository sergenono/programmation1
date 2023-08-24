package prog2;

public class Kontrollstruktur_MirpZahlen {

	public static void main(String[] args) {
		int schranke = 100;
		
		int cont = 0 ;
		int result ;
		int rest ;
		
		
		
		for(int i = 1 ;  i <=  schranke  ;  i++)
		{
			if(i >= 10)
			{
				result = i / 10 ;
				rest  =  i % 10  ;
				
				cont = (rest*10)+ result ;
				int counter1 = 0 ;
				int counter2 = 0 ;
				
				for(int j = 1 ; j <= i ; j++)
				{
					if(i % j == 0)
					{
						counter1 =  counter1 + 1 ;
						//System.out.print(i);
					}
				}
				/*if(counter1 == 2 )
				{
					System.out.print(i   + "   ");
				} */
				
				
				
				for(int k = 1 ; k <= cont  ;  k++)
				{
					if(cont % k == 0)
					{
						counter2 =  counter2 + 1 ;
					}
				}
				if(counter1 == 2 && counter2 == 2)
				{
					System.out.print(i   + "   ");
					//System.out.print(cont   + "   ");
				}
			}
			
		}

	}

}
