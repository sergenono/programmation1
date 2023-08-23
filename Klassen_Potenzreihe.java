package prog2;

public class Klassen_Potenzreihe {
	
	// ln(1 + x) =  x - (x^2 / 2) +  (x^3 /3 ) - (x^4 / 4 ) + (x^5 /5 )......
	
	 static double exponent  = 5;
	 
	
			
	 //static double result  = 0 ;
	
	
	
	public static  double ln1plusX(double x  , double eps)
	{
		  double result = 0 ;
		  
		  double  anfangsresult ;
		  
		  double num  = 1 ;
			 
			 double denom = 1 ;
			 
			 int sign = -1 ;
			double y ;
		   
		   double recup = 0 ;
	      if(x  > - 1 &&  x <= 1 )
	      {
	    	  for(int i = 1  ; i <= exponent ; i++)
	    	  {
	    		 
	    		 anfangsresult  = result ;
	    		  
	    		  if(i % 2 !=0 )
	    		  {
	    			 
	    			  if(i == 1)
	    			  {
	    				  y = x ;
	    				  
	    				  result  = result + (-sign)*(num/denom)* y;
	    			  }
	    			  else 
	    			  {
	    				   denom  =  denom + 1;
	    				  result =  result + (-sign) *(num/denom)* x;
	    			  }
	    		System.out.println(result);
	    		  }
	    		  else 
	    		  {
                         denom =  denom +1 ;
	    			  
	    			  result =  result + sign *(num/denom)* x ;
	    		System.out.println(result);
	    		  }
	    		  
	    		  
    		  
	    		  x *= x ;
	    		  
	    		  
	    		  if((result- anfangsresult)<=eps)
	 	    		 
{
	recup =  result ;
}
	
	    	/*else 
	    		  {
	    			  System.out.println("result - anfangsresult > eps" ) ;
	    		  }  */

	    	  }
	    	  
	    	 
	    	  
	    	System.out.println(recup);
	    
	    	 
	      }
	     
	      else
	      {
	    	  System.out.println("false Eingabe");
	      }
	   
	  
	      return result ;
	}  
	
public static void main(String[] args) {
		
	
		 double end = ln1plusX(1, 0.00000001);
	}

}
