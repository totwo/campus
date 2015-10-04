/**
 * 
 */
package HengSheng;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年10月4日
 * 质因数分解
 * Pollard Rho因数分解
 * 对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成： 
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 * 参考链接http://www.cnblogs.com/youxin/p/3232049.html
 */
public class ZhiYinShuFenJie2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数字");
		int n = scanner.nextInt();
		scanner.close();
		System.out.print(n+"=");
		for(int i=2;i<=n;i++){
			while(n!=i){
				if(n%i==0){
					System.out.print(i+"*");
					n=n/i;
				}else 
					break;
			}
		}
		System.out.println(n);
	}
}
