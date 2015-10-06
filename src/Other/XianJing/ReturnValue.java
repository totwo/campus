/**
 * 
 */
package Other.XianJing;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 优柔寡断的返回值
 */
public class ReturnValue {
	public static void main(String[] args) {
		System.out.println(decision());
	}
	
	public static boolean decision(){
		try {
			return true;//此处写了return还是返回不出去的
		}finally{//finally永远都会执行,永远都会返回false
			return false;
		}
	}

}
