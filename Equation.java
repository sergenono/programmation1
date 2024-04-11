 package sur;

public class Equation{
  
	double a ;
	double b ;
	double c ;
	double discriminant ;
	double w  ;
    public Equation(double a , double b , double c) {
    	this.a = a ;
    	this.b = b ;
    	this.c = c ;
    }
    public Solution solve() throws UnsolvableException , NoQuadraticException{
    	discriminant = this.b*this.b -4*this.a*this.c ;
    	w =  Math.sqrt(discriminant);
    	double x11 = 0 , x22 ;
    	
    	if( a == 0)
    		throw new  NoQuadraticException("Not quadratic :a = 0 not allowed") ;
    	if(discriminant < 0)
    		throw new UnsolvableException("Unsolvable : b*b-4*a*c < 0") ;
    	if(a == w || b == w || c ==w)
    		throw new IllegalArgumentException();
    	
    	   x11 =  (-b+w)/(2*a);
    	   x22  = (-b -w)/(2*a );
    	  Solution  result = new Solution(x11 , x22) ;
    	
    	return  result  ;
    }
}
