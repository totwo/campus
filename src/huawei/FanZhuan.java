package huawei;
import java.util.Scanner;

/**
 * 将数字进行翻转,如输入1234,输入4321,考虑了是负数的情况
 * @author Dahai
 * @Date 2015年9月30日
 */
public class FanZhuan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isNegative = false;
		int i = scanner.nextInt();
		scanner.close();
		if (i <0) {//判断是否是负数
			i = -i;
			isNegative = true;
		}
		String string = "";
		while(i!=0){
			string += i%10;//每次取余数,拼接上
			i = i/10;
		}
		int a = Integer.parseInt(string);//在转换成int型
		System.out.println(isNegative ? -a : a);
	}
}
