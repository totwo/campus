/**
 * 
 */
package huawei;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015��9��23��
 * �ַ������һ�����ʵĳ���
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
