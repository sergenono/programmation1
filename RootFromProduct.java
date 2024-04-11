package sur;

public class RootFromProduct {
	
		 public double  calculate(double...args)throws NegativeNumberException {
			 double result = 1.0 ;
			 double result2  ;
			 for(double i : args) {
				 if(i < 0) {
					 throw new NegativeNumberException("negative number");
				 }
					 else { 
				result =  result *i ;
					 }
				
					 
				 }
			 result2 = Math.sqrt(result) ;
			 return result2;
			 }
	public static void main(String[] args) {
		if(args.length == 0)
		{
			System.out.println("kein Argument wurde gegeben") ;
		}
		else {
		RootFromProduct a ;
		double[] array =  new double[args.length] ;
		try {
			a =  new RootFromProduct() ;
			for(int i =  0 ; i < array.length ; i++)
			{
				array[i] = Double.parseDouble(args[i]) ;
			}
			System.out.println(a.calculate(array)) ;
		}
		catch(NegativeNumberException ex)
		{
			System.out.println(ex.getMessage()) ;
		}
		catch(Exception ex)
		{
			System.out.println("fehler") ;
		}
		}

	}

}
