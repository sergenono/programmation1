package prog2;

public class Klasse_Kaffemachinen {

	double  wasserbehaelter ;                          // enthaelt wasser  im (ml)
	double kaffebohnenbehaelter ;                       // enthaelt   kaffeebohnen in gramm(g)
	int tasseKaffee = 0 ;
	int counterTasseKaffee  = tasseKaffee ;                                   // anzahl von tasse kaffee am anfang 
	
	public Klasse_Kaffemachinen(double  wasserbehaelter , double kaffebohnenbehaelter)
	{
		 this.wasserbehaelter =  wasserbehaelter ;
		 this.kaffebohnenbehaelter = kaffebohnenbehaelter ;
	}
	
	public double auffuellungVonKaffebehaelter(double k)
	{
		if(kaffebohnenbehaelter == 0)
		{
			kaffebohnenbehaelter = k ;
		}
		return kaffebohnenbehaelter ;
	}
	public  double auffuellungVonWasserbehaelter(double w)
	{
		if(wasserbehaelter == 0)
		{
			wasserbehaelter  = w ;
		}
		return wasserbehaelter ;
	}
	
	public  double eineTasseKaffeMachen(double k1 , double w1)
	{
		if(k1 >= 150  &&  w1 >= 7.5)
		{
			tasseKaffee =  tasseKaffee + 1 ;
		}
		else 
		{
			System.out.println("Fehlermeldung zu wenig wasser und kaffeebohnen");
		}
		return  tasseKaffee ;
	}
	
	public void informationsausgabe()
	{
	
      if(wasserbehaelter >= 150   &&  kaffebohnenbehaelter >= 7.5)
      {
		while(wasserbehaelter >= 150   &&  kaffebohnenbehaelter >= 7.5)
		{
			//int counter = 0 ;
		
			counterTasseKaffee = counterTasseKaffee + 1 ;
			int counter = 0 ;
			  while(counter < counterTasseKaffee)
			     {
				  
				   if( counter == 12)
				   {
					System.out.println(
							"soll die kaffeemachine gereinigt werden nach 12 tasseKaffee");
				   }
				   
				   counter++ ;
			     } 
			      
			   
				
				wasserbehaelter = wasserbehaelter - 150 ;
				 kaffebohnenbehaelter =  kaffebohnenbehaelter - 7.5 ;
		}
		
		System.out.println( "Anzahl von tasseKaffee :" + counterTasseKaffee);
      }
      else 
      {
    	  System.out.println("wasser und bohnen nachfuellen");
      }
		
	}

	}	

