package prog2;

public class Kontrollstruktur_weihnachtsbaum {

	public static void main(String[] args) {
		
		int hoeheDerBaum  =  Integer.parseInt(args[0]);
		//String a = " ";
		
		for(int i = 1 ; i <= hoeheDerBaum  ; i++)
		{
			int anzahlDerSpalte = (hoeheDerBaum *2 ) - 1 ;
			for(int j = 1 ; j <=  anzahlDerSpalte ; j++ )
			{
				if(i == 1)
				{
					if(j != 5 )
						System.out.print( " ");
					else
						System.out.print("*");
				}
				if(i == 2)
				{
					if(j == 4 || j == 5 || j == 6 )
						System.out.print("*");
					else 
						System.out.print( " ");
				}
				if(i == 3)
				{
					if(j== 1 || j == 2 || j == 8 ||j == anzahlDerSpalte)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				if(i == 4 )
				{
					if(j ==1 || j == anzahlDerSpalte)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				if(i== 5)
				{
					System.out.print("*");
				}
			
					
				//System.out.print("*");
				
			}
			System.out.println(" ");
			
		}
		System.out.print("    I");

	}

}
