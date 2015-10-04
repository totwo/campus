/**
 * 
 */
package HengSheng;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年10月3日
 * 质因数分解
 * 找到一个更好的算法,参看ZhiYinShuFenJie2
 */
public class ZhiYinShuFenJie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数字");
		int n = scanner.nextInt();
		int i;
		System.out.print(n+"=");
		for ( i = 2; i <= n; i++)
		{
			if( !is_Odd(i)) continue;
			if (n%i == 0)
			{
				while(true)
				{
					System.out.print(i);
					n /= i;
					if (n!=1) System.out.print("*");
					if(n%i != 0)break;
				}
			}
		}
		System.out.println();
	}
	
	/**
	 * 判读是否为素数
	 * @param n
	 * @return
	 */
	public static boolean is_Odd(int n)
	{
		if(n==2 || n==3) return true;
		if(n%2 ==0)return false;
		int i;
		for (i = 3;  i<= n/2; i++) 
			if(n%i ==0) return false;
		return true;
	}
}










