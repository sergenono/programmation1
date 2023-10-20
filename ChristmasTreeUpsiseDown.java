package sur;

class ChristmasTreeUpsiseDown {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int anzahlSpalte = (n*2) - 1 ;
		
		System.out.println("Anzahl der (Baum-)Zeilen :" +  n);
		for(int i = 0 ; i<n -1 ; i++)
		System.out.print(" ");
		
		  System.out.println("I") ;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < anzahlSpalte-i ;j++)
			{
				if(j >= i)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
		
		
				
			}
			System.out.println();
		}
		for(int i = 0 ; i<n -1 ; i++)
			System.out.print(" ");
			
			  System.out.println("X") ;

	}

}
