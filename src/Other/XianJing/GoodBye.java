/**
 * 
 */
package Other.XianJing;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 让finally不执行
 */
public class GoodBye {
	public static void main(String[] args) {
		try{
			System.out.println("Hello world");
			System.exit(0);//程序退出了,这样finally就没法执行了
		}finally{
			System.out.println("GoodBye world");
		}
	}

}
