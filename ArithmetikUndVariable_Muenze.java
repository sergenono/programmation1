package prog2;

public class ArithmetikUndVariable_Muenze {

	public static void main(String[] args) {
		double  dollar = Double.parseDouble(args[0]);
		
		
		int buck ;
		int half ;
		int quarter ;
		int dime ;
		int nickel ;
		int penny ;
		
		
		buck = (int)dollar;
		
		int rest = (int)(( dollar - buck)*100) ;
		half = rest / 50 ;
		quarter = ((rest % 50)) /25 ;
		dime  = ((rest % 50)%25)/10 ;
		nickel =(((rest  % 50 )% 25)%10)/5 ;
		penny =((((rest  % 50 )% 25)%10)%5)/1 ;
		
		
		System.out.println(buck + "* 1 Dollar");
		System.out.println((rest));
		System.out.println(half + "* 50 cent");
		System.out.println(quarter + "* 25 cent");
		System.out.println(dime + "* 10 cent");
		System.out.println(nickel + "* 5 cent");
		System.out.println(penny + "*  1 cent");
		

	}

}
