package prog2;

public class Klassen_Potenzreihe {
	
	// ln(1 + x) =  x - (x^2 / 2) +  (x^3 /3 ) - (x^4 / 4 ) + (x^5 /5 )......
	
	 static double exponent  = 6;
	 
	
			
	 //static double result  = 0 ;
	
	
	
	public static  double ln1plusX(double x  , double eps)
	{
		  double result = 0 ;
		  
		  double num  = 1 ;
			 
			 double denom = 1 ;
			 
			 int sign = -1 ;
			double y ;
		   
		   
	      if(x  > - 1 &&  x <= 1 )
	      {
	    	  for(int i = 1  ; i <= exponent ; i++)
	    	  {
	    		 
	    		 
	    		  
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
	    		  }
	    		  else 
	    		  {
                         denom =  denom +1 ;
	    			  
	    			  result =  result + sign *(num/denom)* x ;
	    		  }
	    		  x *= x ;
	    	  }
	    	  
	    	 //esult = result;
	    	  
	    	  System.out.println(result);
	    
	    	 
	      }
	     
	      else
	      {
	    	  System.out.println("false Eingabe");
	      }
	   
	  
	      return result ;
	}  
	
public static void main(String[] args) {
		
	//lassen_Potenzreihe p =  new Klassen_Potenzreihe();
		 double end = ln1plusX(1, 0.00000001);
	}

}
