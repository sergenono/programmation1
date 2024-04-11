package sur;

public class EquationSolver {

	public static void main(String[] args) {
		Equation eq ;
		try
		{
	      eq =  new  Equation(Double.parseDouble(args[0]) , Double.parseDouble(args[1]) , Double.parseDouble(args[2])) ;
			Solution solution = eq.solve() ;
			System.out.printf("Solution x1:%.1f , Solution x2 :%.1f", solution.getX1() , solution.getX2()) ;
		
		}
		catch(NoQuadraticException q) {
			System.out.println(q.getMessage()) ;
		}
		catch(UnsolvableException u)
		{
			System.out.println(u.getMessage()) ;
		}
		catch(IllegalArgumentException i) {
			System.out.println(i.getMessage()) ;
		}

	}

}
