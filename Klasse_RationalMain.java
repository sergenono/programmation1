package prog2;

public class Klasse_RationalMain {

	public static void main(String[] args) throws Exception{
	
		
		Klasse_Rational r1 =  new Klasse_Rational ();
		Klasse_Rational r2 =  new Klasse_Rational (1);
	
		r1.output();
		r2.output();
		try
		{
			Klasse_Rational r3 =  new Klasse_Rational (8 , 8);	
		r3.output();
		Klasse_Rational r6 =  new Klasse_Rational ();
		r6.add(r3);
		 System.out.println(r6.reduce());
		Klasse_Rational r7 =  new Klasse_Rational ();
		r7.sub(r3);
		Klasse_Rational r8 =  new Klasse_Rational ();
		r8.mult(r3);
		Klasse_Rational r9 =  new Klasse_Rational ();
		r9.div(r3);
		}
		catch(Exception ex)
		{
			System.out.println("clipping failed - giving up");
		}
		Klasse_Rational r4 =  new Klasse_Rational (r2);
		r4.output();
		
		System.out.println(r2.getDenom());
		Klasse_Rational r5 =  new Klasse_Rational ();
		
		r5.invert(r2);
		
		
		//System.out.println(r1.text());

	}

}
