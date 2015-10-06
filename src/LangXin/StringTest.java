/**
 * 
 */
package LangXin;

/**
 * @author Dahai
 * @Date 2015年10月3日
 * String对象判断
 */
public class StringTest {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		boolean result1 = str1.equals(str2);
		boolean result2 = str2.equals(str3);
		boolean result3 = str1 == str2;
		boolean result4 = str2 == str3;
		System.out.println(result1+","+result2+","+result3+","+result4);
	}

}
