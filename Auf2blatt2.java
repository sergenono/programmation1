package sur;

public class Auf2blatt2 {

	public static void main(String[] args) {
	
		
		
		double a = (16.0/9.0)*(16.0/9.0) ;
		double b = 3.0 * (1.0 /8.0);       // funktioniert nicht 
		double d = Math.sqrt(10) ;
		double c = 3.0 *(1.0/7.0);
		
		System.out.printf("%.15g%n", Math.PI);     // funktioniert 
		System.out.printf("%.15g%n"  , a );
		System.out.printf("%.15g%n", b);
		System.out.printf("%.15g%n", c);
		System.out.printf("%.15g%n", d);

	}

}
