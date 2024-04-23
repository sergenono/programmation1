package sur;

public class Ganzzahlarithmetik {
               // log_2(x)
	public static long log(long n)throws Exception
	{
		int count = 0 ;
		//long result  = n/3 ;
		if(n <= 0)
			throw new IllegalArgumentException("logarithmus einer negative Zahl ist in der reelen zahl nicht definirt") ;
		else {
			assert n >= 1 ;
			while(n > 1)
			{
				if(n % 2 == 0) {
					count++ ;
				}
				n =  n / 2 ;
			}
		}
		assert count >= 0 && count <= Long.MAX_VALUE ;
		return count ;
	}
	public static void main(String[] args) {
		try {
		System.out.println(log(3)) ;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage()) ;
		}

	}

}
