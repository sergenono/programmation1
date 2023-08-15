package prog2;

public class Klassen_Potenzreihe {
	
	double x  = 0.9 ;                          // eingabe 
	double eps ;
	 //static double result  = 0 ;
	
	
	
	public static  double ln1plusX(double x  , double eps)
	{
		  double result = 0 ;
		  
		   double r1 = 1/2 ;
		   
		   double r2 =  1;
	      if(x  > - 1 &&  x <= 1 )
	      {
	    	  for(int i = 1  ; i <= eps ; i++)
	    	  {
	    		  if(i % 2 == 0)
	    		  {
	    			   if(i == 2 )
	    			   {
	    			  result = result - (r1 * x)   ;
	    			   }
	    			   else
	    			   {
	    				   result =  result - ((r1/2)*x);
	    			   }
	    			  
	    		  }
	    		  else
	    		  {
	    			  if(i == 1)
	    			  {
	    				  result = result + (r2 * x);
	    			  }
	    			  else 
	    			  {
	    				  result =  result + (((r2/2)-1)* x);
	    			  }
	    		  }
	    	  }
	    	  
	    	  System.out.println(result);
	      }
	      else
	      {
	    	  System.out.println("false Eingabe");
	      }
	      return result ;
	}
	

}
