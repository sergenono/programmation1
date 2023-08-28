package prog2;

public class Klasse_Rational {

	int  num ;
	int  denom ;
	
	public Klasse_Rational()
	{
		num = 0 ;
		denom = 1 ;
	}
	public  Klasse_Rational(int n)
	{
		num = n ;
		denom = 1 ;
	}
	public Klasse_Rational(int n , int d)throws ArithmeticException 
	{
		if(d == 0)
		{
			throw new ArithmeticException();
		}
		if(d > 0) 
		{
		num = n ;
		denom =  d ;
		}
	}
	public Klasse_Rational(Klasse_Rational r)
	{
		num = r.num ;
		denom = r.denom;
	}
	public int getNum()
	{
		return this.num ;
	}
	public int getDenom()
	{
	
		if(denom > 0 ) 
		
			 return this.denom ;
		return this.denom ;
	
	}
	Klasse_Rational invert(Klasse_Rational p)
	{
		int n =  p.denom ;
		int d  =  p.num ;
		int r  = n /d ;
		Klasse_Rational  result =  new Klasse_Rational(n , d);
		
		System.out.printf("%d / %d = %d%n ", n , d , r);
		return result ;
	}
	
	public void output()
	{
		int erg  = num/denom ;
		System.out.printf("%d / %d = %d%n",  num , denom , erg);
	}
	/*public String text()
	{
		if(getDenom() == 0)
			return  "" + getNum();
		else 
			return getNum()+ "/" + getDenom() ;
	}*/
	
	public Klasse_Rational add(Klasse_Rational s)throws ArithmeticException
	{
		
		int n = s.num;
		int d =  s.denom ;
		int r  = ((n*denom)+(d*num)) ;
		int h = (d*denom) ;
		
		if(h == 0 )
		{
			throw new ArithmeticException();
		}
		else 
		{
		Klasse_Rational  result =  new Klasse_Rational(n , d);
		System.out.printf("%d / %d + %d / %d =  %d /%d%n",   n , d ,num , denom , r , h);
		
		return result ;
		}
	}
	
	public Klasse_Rational sub(Klasse_Rational i) throws ArithmeticException
	{
		int n = i.num;
		int d =  i.denom ;
		int r  = ((n*denom)-(d*num)) ;
		int h = (d*denom) ;
		if(h == 0)
		{
			throw new ArithmeticException();
		}
		else 
		{
		Klasse_Rational  result =  new Klasse_Rational(n , d);
		System.out.printf("%d / %d - %d / %d =  %d /%d%n",   n , d ,num , denom , r , h);
		return result ;
		}
	}
	 public Klasse_Rational mult(Klasse_Rational z)throws ArithmeticException
	{
		 int n = z.num;
			int d =  z.denom ;
			int r  = num*n ;
			int h = d*denom ;
			if(h == 0)
			{
				throw new ArithmeticException();
			}
			else 
			{
			Klasse_Rational  result =  new Klasse_Rational(n , d);
			System.out.printf("%d / %d * %d / %d =  %d /%d%n",   n , d ,num , denom , r , h);
			return result ;
			}
	}
	 
	 public Klasse_Rational div(Klasse_Rational u)	throws ArithmeticException
	 {
		 int n = u.num;
			int d =  u.denom ;
			int r  = n*denom ;
			int h = d*num ;
			if(h== 0)
			{
				throw new ArithmeticException();
			}
			else 
			{
			Klasse_Rational  result =  new Klasse_Rational(n , d);
			System.out.printf("%d / %d / %d / %d =  %d /%d%n",   n , d ,num , denom , r , h);
			return result ;
			}
	 }
	 public Klasse_Rational reduce()
	 {
		 int  gcd =  gcd(num , denom);
		 this.num /= gcd ;
		 this.denom /= gcd ;
		 return this ;
	 }
	 static  int gcd(int n ,int  d)
	 {
		 int rest =n%d ;
		 while(rest != 0)
		 {
			 n= d;
			 d =  rest ;
			 rest  = n%d ;
		 }
		 return d ;
	 }
	
}
