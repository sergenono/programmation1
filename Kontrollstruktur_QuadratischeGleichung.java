package prog2;

public class Kontrollstruktur_QuadratischeGleichung {

	public static void main(String[] args) {
		int a =  Integer.parseInt(args [0]);
		int b =  Integer.parseInt(args [1]);
		int c =  Integer.parseInt(args [2]);
		
		 //  quadratische Gleichung  a *x*x  + b*x + c = 0
		
		double diskriminant = b*b - 4*a*c ;
		
		
		if(a == 0  &&  b == 0 &&  c== 0)
		{
			System.out.println("identische Gleichung , die fuer alle werte von x erfuellt ist ");
		}
		else if(a == 0 &&  b != 0 && c != 0)
		{
			int x ;
			if(b > 0 &&  c > 0)
			{
				x = -c/b ;
			}
			else if(b < 0 && c < 0)
			{
				x= c / -b ;
			}
			/*else if(b < 0 && c >0)
			{
				x = -c/b ;
			}*/
			else 
			{
				x= -c/ b ;
			}
			
			System.out.println(x);
			System.out.println("es existiert eine einzige reelle loesung");

		}
		else if(a != 0 &&  b != 0  &&  c != 0)
		{
			double x1 ;
			 double x2 ;
			 
			if(diskriminant == 0)
			{
				x1 = -b / 2*a ;
				x2 = x1 ;
				
				System.out.println(x2);
				System.out.println("es existiert eine doppelte reelle loesung");
			}
			else if(diskriminant > 0)
			{
				x1 = (-b + (Math.sqrt(diskriminant))) / 2*a ;
				x2 = (-b - (Math.sqrt(diskriminant))) / 2*a ;
				
				System.out.println( "x1 = "+ x1);
				
				System.out.println("x2 ="+ x2);
				System.out.println("es existiert zwei relle loesung");
			}
			else 
			{
				System.out.println("kein x gehoert zu C erfuellt die Gleichung");
				  
				// komlexe zahlen 
				double reelTeil ;
				double  imgTeil ;
				
			
				
				diskriminant = diskriminant * (-1)  ;
				
				
				reelTeil = -b / 2*a ;
				imgTeil  = Math.sqrt(diskriminant)/ 2*a;
				
				
				//x1 = reelTeil + imgTeil ;
				//x2 = reelTeil -  imgTeil ;
				
				System.out.println("x1 = " + reelTeil +  "+" + imgTeil + "i");
				
				System.out.println("x2 = " + reelTeil + "+" + imgTeil + "i");
				System.out.println(diskriminant);
			}
		}

	}

}
