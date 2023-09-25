package prog2;

public class Klassen_CalcSomething {
    
	
	 public  static int c( int a , int b)
	 {
		 int counter  = b ;
		 int result  = 1 ;
		 while(counter != 0 )
		 {
			 
			if(counter != 0) 
			 {
			 
				  result = result * a ; 
				  System.out.println(result);
				
			 }
			counter =  counter - 1  ;
		 }
		return result;
	 }
	public static void main(String[] args) {
		
		System.out.println(c(2 , 5));

	}

}
