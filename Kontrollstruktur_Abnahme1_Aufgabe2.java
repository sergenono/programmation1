package prog2;

public class Kontrollstruktur_Abnahme1_Aufgabe2 {

	public static void main(String[] args) {
		int zeile = Integer.parseInt(args[0]);
		int spalte = (zeile*2) - 1 ;
		for(int i=1 ; i <= zeile ; i++)
		{
			for(int j=1; j<= spalte ; j++)
			{
				if(i == 1)
				{
					if(j == 5)
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				
				}
				else if( i == 2) 
				{
					if(j == 3 || j==7)
					{
						System.out.print("i");
					}
					else if(j == 4 || j==5 || j == 6)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i == 3)
				{
				    if(j == 1 || j == 2 || j== 8 || j == spalte)
				    {
				    	System.out.print(" ");
				    }
				    else
				    {
				    	System.out.print("*");
				    }
					
				}
				else if(i == 4)
				{
					if(j == 1 || j == spalte)
					{
					System.out.print("i");
					}
					else 
					{
						System.out.print("*");
					}
				}
				else
				{
					System.out.print("*");
				}
				
				
			}
			System.out.println(" ");
		}

	}

}
