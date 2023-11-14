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
		int t1y = ty ;
		int ox = 0 ;
		int oy = 0 ;
		
		                 // berechnung  vector 
		int p1xpx =  (px - p1x) ;
		int p1ypy =  (py -p1y);
		
		int qxq1x = (q1x -qx);
		int qyq1y = (q1y - q1y);
		
		int p1xqx = (qx - p1x);
		int p1yqy = (qy - p1y);
		
		int pxq1x = (q1x - px);
		int pyq1y = (q1y - py);
		
		
		int txt1x = (t1x -tx);
		int tyt1y = (t1y - ty);
		
		int s1xsx = (sx - s1x);
		int s1ysy = (sy - s1y );
		
		int s1xtx = (tx - s1x);
		int s1yty =(ty - s1y) ;
		
		int sxt1x = (t1x - sx);
		int syt1y = (t1y -sy);
		
		      // distance berechnet 
		
		int p1p =(int) Math.sqrt(p1xpx * p1xpx + p1ypy*p1ypy);
		int qq1 = (int)Math.sqrt(qxq1x*qxq1x + qyq1y*qyq1y);
		int p1q =  (int)Math.sqrt(p1xqx*p1xqx + p1yqy*p1yqy);
		int pq1 = (int)Math.sqrt(pxq1x*pxq1x + pyq1y*pyq1y);
		
		int tt1 =(int) Math.sqrt(txt1x*txt1x + tyt1y*tyt1y);
		int s1s =(int) Math.sqrt(s1xsx*s1xsx + s1ysy*s1ysy);
		int s1t = (int)Math.sqrt(s1xtx*s1xtx + s1yty*s1yty );
		int  st1 = (int)Math.sqrt(sxt1x*sxt1x + syt1y*syt1y);
		
	
		
		if((px < tx  &&  qx < sx) && (py  < ty && qy  < sy) )
		{
			//if((p1p >0)  && (qq1 >0 ) &&( p1q >0 )&& (pq1 >0 )&& (tt1 >0 ) && (s1s >0)&& (s1t >0)&& (st1 >0 ))
			//{
				System.out.println("disjiont");
			//}
		}
		else if((p1x == s1x) && (p1y == s1y) && (px == sx) && (py == sy) && (qx== tx)&& (qy == ty)&& (t1x == q1x) && (t1y ==q1y) && (p1p == s1s)&&(qq1 == tt1) && (p1q== s1t) &&(pq1 == st1) )
		{
			System.out.println("same");
		}
		else if((px == s1x)  && (tx == q1x) || (qy == s1y) && (sy == q1y))
		{
			
			System.out.println("aligned") ;
		}
		else if((px==tx && py==ty) || (qx == sx && qy ==sy) ||(s1x == q1x && s1y== q1y) || (t1x == p1x && t1y== p1y))
		{
			System.out.println("touching");
		}
		

	}

}
