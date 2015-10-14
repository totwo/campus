package huawei;
import java.util.Scanner;
/**
 * @author Dahai
 * @Date 2015年9月16日
 * 输入一个字符串
 * 输出重复的字符
 */
public class RepeatOut {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		scanner.close();
		char a [ ] = string.toCharArray();
		int b [ ] = new int[26*2];
		for (int i = 0; i < a.length; i++) {
			if ( b[a[i]-65] == 1) {
				System.out.print(a[i]);
				b[a[i]-65]++;
			}else if(b[a[i]-65] == 0){
				b[a[i]-65]++;
			}
		}
	}
}
