/**
 * 
 */
package huawei;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年9月28日
 * Lily上课时使用字母数字图片教小朋友们学习英语单词，
 * 每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。请大家给Lily帮忙
 *输入: Lily使用的图片包括"A"到"Z"、"a"到"z"、"0"到"9"。输入字母或数字个数不超过1024。
 *输出	Lily的所有图片按照从小到大的顺序输出
 *样例输入	Ihave1nose2hands10fingers
 *样例输出	0112Iaadeeefghhinnnorsssv
 */
public class ZhengLi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String  s = scanner.nextLine();
		scanner.close();
		char m[] = s.toCharArray();
		int a[] = new int[10];
		int b[] = new int[36*2];
		for (int i = 0; i < m.length; i++) {
			if( ('0' <= m[i]) && (m[i] <= '9') ){
				a[m[i]-48]++;
			}else {
				b[m[i]-65]++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i]; j++) {
				System.out.print( (char)(i+48) );
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i]; j++) {
				System.out.print(  (char)(i+65) );
			}
		}
	}
}
