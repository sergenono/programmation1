package sur;

public class Auf3blatt2 {

	public static void main(String[] args) {
		double max = Double.parseDouble(args[0]);
		
		double b = (max*95) / 100 ;
		
		System.out.printf("1.0: %.1f - %.1f (100,0-95%%)%n", max , b);
		System.out.printf("1.3: %.1f - %.1f ( 94,9-90%%)%n", b-0.1 , (max*90)/100);
		System.out.printf("1.7: %.1f - %.1f ( 89,9-85%%)%n", ((max*90)/100)-0.1 , (max*85)/100);
		System.out.printf("2.0: %.1f - %5.1f ( 84,9-80%%)%n", ((max*85)/100)-0.1 , (max*80)/100);
		System.out.printf("2.3: %5.1f - %5.1f ( 79,9-75%%)%n", ((max*80)/100)-0.1 , (max*75)/100);
		System.out.printf("2.7: %5.1f - %5.1f ( 74,9-70%%)%n", ((max*75)/100)-0.1 , (max*70)/100);
		System.out.printf("3.0: %5.1f - %5.1f ( 69,9-65%%)%n", ((max*70)/100)-0.1 , (max*65)/100);
		System.out.printf("3.3: %5.1f - %5.1f ( 64,9-60%%)%n", ((max*65)/100)-0.1 , (max*60)/100);
		System.out.printf("3.7: %5.1f - %5.1f ( 59,9-55%%)%n", ((max*60)/100)-0.1 , (max*55)/100);
		System.out.printf("4.0: %5.1f - %5.1f ( 54,9-50%%)%n", ((max*55)/100)-0.1 , (max*50)/100);
		System.out.printf("5.0: weniger als %.1f punkte ", (max*50)/100 ) ;
	}

}
