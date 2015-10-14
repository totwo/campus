package huawei;
import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年10月14日
 * 字符串中挑数字并排序
 * 输入:  abzxcd12efgdhi543fexy
 * 输出: 12345
 */

public class TiaoNumAndSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入字符串:");
		String string = scanner.nextLine();
		scanner.close();
		String s = "";

		for (int i = 0; i < string.length(); i++) {//先把数组取出来并拼接到成一个字符串
			char c = string.charAt(i);
			if(  !(c >='A' && c<='z') ){
				s +=c;
			}
		}
		
		char b[] = s.toCharArray();//将数字字符串转成数组
		char tmp;
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]>b[j]){
					tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
