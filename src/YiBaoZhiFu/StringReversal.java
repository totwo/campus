/**
 * 
 */
package YiBaoZhiFu;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年10月14日
 * 写一个函数,把输入的字符串倒序输出
 * 例:输入ABC,输出CBA
 * 
 */
public class StringReversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s = sc.nextLine();
		sc.close();
		for (int i = s.length()-1; i >= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
