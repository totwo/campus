/**
 * 
 */
package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 将输入的字符串中的数字进行排序,例如,输入29shf23 ,输出2239
 * @author Dahai
 * @Date 2015年9月30日
 */
public class SortNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		ArrayList<String> arrayList = new ArrayList<String>();
		scanner.close();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);//依次取出每个字符
			if (Character.isDigit(ch)) {//判断是否是数字
				arrayList.add(string.charAt(i) + "");//用ArrayList总感觉大材小用了,好浪费呀.
			}
		}
		Collections.sort(arrayList);//排序
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print( arrayList.get(i) );
		}
	}
}
