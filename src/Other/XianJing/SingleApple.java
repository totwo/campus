/**
 * 
 */
package Other.XianJing;

import JD.Apple;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 错误的单例模式
 */
public class SingleApple {
	private static SingleApple apple = null;
	private SingleApple() {}
	public static SingleApple getApple(){//懒汉单例模式
		if(apple == null){
			apple = new SingleApple();
		}
		return apple;
	}
}


class SingleApple2 {//饿汉单例模式
	private static SingleApple2 apple = new SingleApple2();
	private SingleApple2() {}
	public static SingleApple2 getApple(){
		return apple;
	}
}











