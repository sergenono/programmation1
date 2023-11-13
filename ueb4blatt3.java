package sur;

public class ueb4blatt3 {

	public static void main(String[] args) {
	
		int tag =  Integer.parseInt(args [0]);
		int monat =  Integer.parseInt(args [1]);
		int jahr =  Integer.parseInt(args [2]);
		int beideLetzteZahlVonJahr;
		int beideErsteZahlVonJahr =0;
		
		if(monat >= 3 || monat <= 12)
		{
		     beideLetzteZahlVonJahr = jahr%100 ;
		}
		else 
		{
			beideLetzteZahlVonJahr = (jahr %1000) -1 ;
			if(jahr == 1) {
				beideErsteZahlVonJahr = 13 ;
			}
			else if(jahr == 2)
			{
				beideErsteZahlVonJahr = 14 ;
			}
			else 
			{
				beideErsteZahlVonJahr= jahr /100 ;
			}
		}
			
		
		
		int h = ( tag + Math.abs(((monat +1)*13)/5) + beideLetzteZahlVonJahr + Math.abs(beideLetzteZahlVonJahr/ 4) + Math.abs(beideErsteZahlVonJahr /4) -(2*beideErsteZahlVonJahr))%7 ;
		
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
							if(h == 1)
							{
							System.out.println("datum korrekt");
							System.out.printf(" Sonnstag den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h == 2)
							{
								System.out.println("datum korrekt");
								System.out.printf(" montag den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h == 3)
							{
								System.out.println("datum korrekt");
								System.out.printf(" dienstag den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h  == 4)
							{
								System.out.println("datum korrekt");
								System.out.printf(" mittwoch den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h == 5)
							{
								System.out.println("datum korrekt");
								System.out.printf(" donnerstag den , %d %d %d%n",  tag , monat , jahr);
							}
							else  if(h == 6)
							{
								System.out.println("datum korrekt");
								System.out.printf(" freitag den , %d %d %d%n",  tag , monat , jahr);
							}
							else 
							{
								System.out.println("datum korrekt");
								System.out.printf(" Samstag den , %d %d %d%n",  tag , monat , jahr);
							}
						
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
							//System.out.println("datum korrekt");
							//System.out.printf("%d %d %d%n",  tag , monat , jahr);
							if(h == 1)
							{
							System.out.println("datum korrekt");
							System.out.printf(" Sonnstag den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h == 2)
							{
								System.out.println("datum korrekt");
								System.out.printf(" montag den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h == 3)
							{
								System.out.println("datum korrekt");
								System.out.printf(" dienstag den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h  == 4)
							{
								System.out.println("datum korrekt");
								System.out.printf(" mittwoch den , %d %d %d%n",  tag , monat , jahr);
							}
							else if(h == 5)
							{
								System.out.println("datum korrekt");
								System.out.printf(" donnerstag den , %d %d %d%n",  tag , monat , jahr);
							}
							else  if(h == 6)
							{
								System.out.println("datum korrekt");
								System.out.printf(" freitag den , %d %d %d%n",  tag , monat , jahr);
							}
							else 
							{
								System.out.println("datum korrekt");
								System.out.printf(" Samstag den , %d %d %d%n",  tag , monat , jahr);
							}
						
						
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
							if(tag <= 29)
							{
								//System.out.println("datum korrekt : schaltjahr");
								//System.out.printf("%d %d %d%n",  tag , monat , jahr);
								if(h == 1)
								{
								System.out.println("datum korrekt : schaltjahr");
								System.out.printf(" Sonnstag den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h == 2)
								{
									System.out.println("datum korrekt : schaltjahr");
									System.out.printf(" montag den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h == 3)
								{
									System.out.println("datum korrekt : schaltjahr");
									System.out.printf(" dienstag den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h  == 4)
								{
									System.out.println("datum korrekt : schaltjahr");
									System.out.printf(" mittwoch den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h == 5)
								{
									System.out.println("datum korrekt : schaltjahr");
									System.out.printf(" donnerstag den , %d %d %d%n",  tag , monat , jahr);
								}
								else  if(h == 6)
								{
									System.out.println("datum korrekt : schaltjahr");
									System.out.printf(" freitag den , %d %d %d%n",  tag , monat , jahr);
								}
								else 
								{
									System.out.println("datum korrekt : schaltjahr");
									System.out.printf(" Samstag den , %d %d %d%n",  tag , monat , jahr);
								}
							
								
							}
							else
							{
								System.out.println("datum nicht korrekt");
							}
						}
						else 
						{
							if(tag <= 28)
							{
								//System.out.println(" datum  korrekt  : aber  kein schaltjahr");
								//System.out.printf("%d %d %d%n",  tag , monat , jahr);
								if(h == 1)
								{
								System.out.println("datum korrekt : aber  kein schaltjahr");
								System.out.printf(" Sonnstag den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h == 2)
								{
									System.out.println("datum korrekt : aber  kein schaltjahr");
									System.out.printf(" montag den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h == 3)
								{
									System.out.println("datum korrekt : aber  kein schaltjahr");
									System.out.printf(" dienstag den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h  == 4)
								{
									System.out.println("datum korrekt : aber  kein schaltjahr");
									System.out.printf(" mittwoch den , %d %d %d%n",  tag , monat , jahr);
								}
								else if(h == 5)
								{
									System.out.println("datum korrekt : aber  kein schaltjahr");
									System.out.printf(" donnerstag den , %d %d %d%n",  tag , monat , jahr);
								}
								else  if(h == 6)
								{
									System.out.println("datum korrekt : aber  kein schaltjahr");
									System.out.printf(" freitag den , %d %d %d%n",  tag , monat , jahr);
								}
								else 
								{
									System.out.println("datum korrekt : aber  kein schaltjahr");
									System.out.printf(" Samstag den , %d %d %d%n",  tag , monat , jahr);
								}
							
							
							}
							else 
							{
								System.out.println(" datum nicht korrekt : kein schaltjahr");
							}
							
							
						}

					}
					
					//System.out.printf("%d %d %d%n",  tag , monat , jahr);
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


