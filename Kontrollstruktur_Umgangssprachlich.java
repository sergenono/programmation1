package prog2;

public class Kontrollstruktur_Umgangssprachlich {

	public static void main(String[] args) {
		
		int i  =  Integer.parseInt(args[0]);
		int j  =  Integer.parseInt(args[1]);
		int k  =  Integer.parseInt(args[2]);
		
		boolean b = Boolean.parseBoolean(args[3]);
		boolean c= Boolean.parseBoolean(args[4]);
		boolean d = Boolean.parseBoolean(args[5]);
		
		
		if(i != 0 && j != 0 && k != 0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(i % 17 == 0  && i > 0 )
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		
		if( j %2 == 0 &&  j > 20 && j <40)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		
		if((k%3 == 0 && k % 5 ==0) || (k % 5 == 0 && k % 7 == 0)|| (k% 5 == 0 && k % 11 == 0))
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		
		if(b || c || d)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}

	}

}
