/**
 * 
 */
package huawei;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年9月23日
 * 字符串最后一个单词的长度
 */
public class ZiFuChuan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String  s = scanner.nextLine();
		scanner.close();
		String a[] = s.split(" ");
		String b = a[a.length-1];
		System.out.println(b.length());
	}
}
