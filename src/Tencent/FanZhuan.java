/**
 * 
 */
package Tencent;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 字符数组翻转
 * 给定一个字符数组，要求写一个将其反转的函数。（函数中要求只能用一个int型的临时变量）
 */
public class FanZhuan {
	public static void main(String[] args) {
		char a[] = {'a','b','c','d','e','e'};
//		reverse1(a, a.length);
		reverse2(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * 使用加减方式
	 * @param a
	 * @param n
	 */
	public static void reverse1(char a[],int n){
		int i = 0;
		while( i < n/2 ){
			a[i] = (char) (a[i] + a[n-i-1]);
			a[n-i-1] = (char) (a[i] - a[n-i-1]);
			a[i] = (char) (a[i] - a[n-i-1]);
			i++;
		}
	}
	
	/**
	 * 使用异或方式
	 * @param a
	 * @param n
	 */
	public static void reverse2(char a[],int n){
		int i=0;
		while(i < (n-i-1) ){
			a[i] = (char) (a[i] ^ a[n-i-1]);
			a[n-i-1] =(char)( a[i] ^ a[n-1-i] );
			a[i] = (char) (a[i] ^ a[n-i-1]);
			i++;
		}
	}
}














