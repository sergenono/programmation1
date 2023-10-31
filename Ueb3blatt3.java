package sur;

public class Ueb3blatt3 {

	public static void main(String[] args) {
		int px = Integer.parseInt(args[0]);
		int py = Integer.parseInt(args[1]);
		int qx = Integer.parseInt(args[2]);
		int qy = Integer.parseInt(args[3]);
		int sx = Integer.parseInt(args[4]);
		int sy = Integer.parseInt(args[5]);
		int tx = Integer.parseInt(args[6]);
		int ty = Integer.parseInt(args[7]);
		
		
		int p1x = qx ;
		int p1y = py ;
		int q1x = px ;
		int q1y = qy ;
		int s1x = tx ;
		int s1y = sy ;
		int t1x = sx ;
		int t1y = sy ;
		int ox = 0 ;
		int oy = 0 ;
		
		                 // berechnung  vector 
		int p1xpx =  (px - p1x) ;
		int p1ypy =  (py -p1y);
		
		int qxq1x = (q1x -qx);
		int qyq1y = (q1y - q1y);
		
	
		
		if((px < tx  ||  qx < sx) && (py  < ty || qy  < sy) )
		{
			
		}

	}

}
