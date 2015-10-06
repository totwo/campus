/**
 * 
 */
package Other.XianJing;

/**
 * @author Dahai
 * @Date 2015年10月6日
 */
public class SingleAppleTest {
	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		SingleApple apple1 = SingleApple.getApple();
		SingleApple apple2 = SingleApple.getApple();
		if(apple1 == apple2){
			System.out.println("是同一个对象");
		}else{
			System.out.println("不是同一个对象");
		}
	}

}
