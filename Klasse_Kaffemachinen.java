package prog2;

public class Klasse_Kaffemachinen {

	double  wasserbehaelter = 0 ;                          // enthaelt wasser  im (ml)
	double kaffebohnenbehaelter = 0 ;                       // enthaelt   kaffeebohnen in gramm(g)
	int tasseKaffee = 0 ;
	int counterTasseKaffee  = tasseKaffee ;                                   // anzahl von tasse kaffee am anfang 
	
	public Klasse_Kaffemachinen(double  wasserbehaelterMax , double kaffebohnenbehaelterMax)
	{
		 wasserbehaelter =  wasserbehaelterMax ;
		 kaffebohnenbehaelter = kaffebohnenbehaelterMax ;
	}

	
	
	
	public double auffuellungVonKaffebehaelter(double k)
	{
		if(kaffebohnenbehaelter >=7.5)
		{
			System.out.println("gibt es genung  bohnen , um eine tasseKaffee zu machen");
			
			
		}
		else 
		{
			System.out.println("soll die  Bohnen ausgefuellt werden");
			kaffebohnenbehaelter =  kaffebohnenbehaelter + k ;
		}
		return kaffebohnenbehaelter ;
	}
	
	
	
	public  double auffuellungVonWasserbehaelter(double w)
	{
		if(wasserbehaelter >= 150)
		{
			System.out.println("gib es genug  wasser , um  eine tasseKaffee zu machen");
			
		}
		else 
		{
			System.out.println("soll die  wasse  ausgefuellt werden"); 
			
			wasserbehaelter  =  wasserbehaelter + w ;
		}
		return wasserbehaelter ;
		
	}
	
	
	public  double eineTasseKaffeMachen(double k1 , double w1)
	{
		k1 = kaffebohnenbehaelter ;
		w1 = wasserbehaelter ;
		
		//System.out.println(k1);
		//System.out.println(w1);
		
		if(k1 >=  kaffebohnenbehaelter  &&  w1  < wasserbehaelter)
		{
			
			System.out.println("nicht genug wasser ! wasser ausfuellen");
			
			 // System.out.println(auffuellungVonWasserbehaelter(60));
			
			
		}
		else if(k1 < kaffebohnenbehaelter && w1 >=wasserbehaelter)
		{
			System.out.println("nicht genug bohnen ! bohnen ausfuellen");
			
			//System.out.println(auffuellungVonKaffebehaelter(50));
		}
		else if(k1 >= kaffebohnenbehaelter && w1 >=wasserbehaelter)
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
						 
						 tasseKaffee =  tasseKaffee + 1 ;
							System.out.println( "tasseKaffee"+  " "+ tasseKaffee);
							
						 System.out.println("rest  von wasser" +  " " + wasserbehaelter   +  " ml");
							System.out.println("rest von bohnen"  +"  " +kaffebohnenbehaelter   +  " g");
							
							
				}
				
				System.out.println( "Anzahl von tasseKaffee :" + counterTasseKaffee);
				
		      }
		      else 
		      {
		    	  System.out.println("wasser und bohnen nachfuellen");
		      }
		
		}
		else 
		{
			System.out.println("nicht genug wasser und nicht genung bohnen ");
		}
		return  counterTasseKaffee ;
	
	}
	
	public void  maschineReinigung()
	{
		
	}
		
		
	public void informationsausgabe()
	{
	
		
	}

	}	

