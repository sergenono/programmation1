package prog2;

public class Kontrollstruktur_Wahrheitstabellen {

	public static void main(String[] args) {
	
		 boolean a = true ;
		 boolean b =  true ;
		 boolean c = true ;
		 
		
		 
		 System.out.print( "a"  +   "           " +   "b"   +  "          "+  "c" + "            "  +    "or"  + "             " +  "and "  + "         " +  "f\n"  );
		 System.out.print("===================================================================================================\n");
		 
		 int n = 3 ;
		 for(int i = 1 ;  i <= n  ;   i++)
		 {
			 boolean d ;
			 boolean e ;
			 boolean f ;
			 
			 d =  a || b|| c ;
			 e =  a && b && c ;
			 f =  (a || b) ^ c ;
			 
			 if(i  <= n/2)
			 {
		     System.out.print(a);
			 }
			 else 
			 {
				 System.out.print(!a); 
			 }
			 
			
			 for(int j = 1 ; j <= n ;  j++)
			 { 
				 if(j == i)
				 {
					 if(j != 3 &&  j!=4  &&  j != 7  &&  j!= n)
					 {
						 System.out.print( "       " + b ); 
					 }
					 else 
					 {
						 System.out.print( "       " + !b );
					 }
				
				 
				 
				
				 for(int k = 1 ;  k  <= n   ;  k++)
					 
				 {
					 if(k == j)
					 {
						 
						 if(k % 2 != 0)
						 {
				
					 System.out.print( "        " + c );
					 
						 }
						 else 
						 {
							 System.out.print( "        " + !c ); 
						 }
					 
						 System.out.print("        " + d);
						 System.out.print("      " + e);
						 System.out.println("           " + f + "\n");
					 }
					
					 
					
				
					 
				 }
				 
				 
				
				 
				}
				  
			 }
			 
			 
			 
		 }
		
	}

}
