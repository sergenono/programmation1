package prog2;

public class Klassen_KaffemachinenMain {

	public static void main(String[] args) {
		
		Klasse_Kaffemachinen km =  new Klasse_Kaffemachinen(3000 ,600);
		
		System.out.println("Maximal bohnen in behaelter :" + " "+ km.auffuellungVonKaffebehaelter( 30) + " " +"g");
		System.out.println("Maximal wasser in behaelter   :" + " "+ km.auffuellungVonWasserbehaelter(100) + " " + "ml");
       km.eineTasseKaffeMachen(7.5 , 150);
        
        km.informationsausgabe();
        
       
	}

}
