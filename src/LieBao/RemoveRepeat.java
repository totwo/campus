/**
 * 
 */
package LieBao;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年10月14日
 * 把字符串中的所有重复字符去掉
 * 
 * 输入描述：
	第一行为一个整数N，表示有N个测试数据，接下来N行，每行一个字符串
	
	输出描述：
	输出N行，每行为对应输入去除重复字符后的结果
	
	输入样例：
	2
	aaaabbAacb
	AA
	
	输出样例：
	abAc
	A
 * 
 * 
 */
public class RemoveRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("请分别输入行数和各行字符串");
		int num = sc.nextInt();
		String out = "";
		for (int i = 0; i < num; i++) {
			String string = sc.next();
			out += (new RemoveRepeat()).removeOneStr(string)+"\n";
		}
		System.out.println(out);
		sc.close();
	}
	
	public String removeOneStr(String s){
		String str = "";
		char a[] = s.toCharArray();
		int b[] = new int[26*2];
		for (int i = 0; i < a.length; i++) {
			if( b[a[i] -65]==0 ){
				str += a[i];
				b[a[i] -65]++;
			}
		}
		return str;
		
	}
	
}
