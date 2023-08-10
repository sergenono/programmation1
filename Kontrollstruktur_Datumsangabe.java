package prog2;

public class Kontrollstruktur_Datumsangabe {

	public static void main(String[] args) {
		int tag =  Integer.parseInt(args [0]);
		int monat =  Integer.parseInt(args [1]);
		int jahr =  Integer.parseInt(args [2]);
		
		if(jahr >= 1583   &&  jahr <= 9999)
		{
			if(monat >= 1 &&  monat <= 12)
			{
				if(tag >= 1  &&  tag <= 31)
				{
					//System.out.println("richtige Datum");
					
					if(monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12)
					{
						if(tag <= 31)
						{
							System.out.println("datum korrekt");
						}
						else 
						{
							System.out.println("datum nicht korrekt");
						}
					}
					else if(monat == 4 ||  monat == 6 ||  monat == 9 || monat == 11)
					{
						if(tag <= 30)
						{
							System.out.println("datum korrekt");
						}
						else 
						{
							System.out.println("datum  nicht korrekt");
						}
					}
					else
					{
						if(((jahr % 4 == 0) && jahr % 100 != 0) || jahr % 400 == 0)
						{
							if(tag == 29)
							{
								System.out.println("datum korrekt : schaltjahr");
							}
							else
							{
								System.out.println("datum nicht korrekt");
							}
						}
						else 
						{
							if(tag == 28)
							{
								System.out.println(" datum  korrekt : aber  kein schaltjahr");
							}
							else 
							{
								System.out.println(" datum nicht korrekt : kein schaltjahr");
							}
							
							
						}

					}
					
					System.out.printf("%d/%d/%d%n",  tag , monat , jahr);
				}
				else 
				{
					System.out.println("false Eingabe");
				}
				
			}
			else
			{
			System.out.println("false Eingabe");
			}
		}
		else
		{
			System.out.println("false Eingabe");		
		
		}
		

	}

}
