/**
 * 
 */
package JD;

/**
 * @author Dahai
 * @Date 2015年9月28日
 */
public class Apple {
	public static int n = 10;//熊数N
	public static int a = (int) Math.pow(n, n);
	public static int b = (int)Math.pow(n-1, n-1);
	
	public static void main(String[] args) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if(solve(i*n+1)){
				System.out.println(n+" "+(i*n+1));
				break;
			}
		}
	}
	
	public static boolean solve(int apple){
		int a0 = apple + n- 1;
		int b0 = b * a0;
		if(b0/a*a == b0 && b0/a >1){
			return true;
		}
		return false;
	}

}
