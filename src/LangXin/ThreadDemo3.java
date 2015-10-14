/**
 * 
 */
package LangXin;

/**
 * @author Dahai
 * @Date 2015年10月10日
 * 继承Thread方式的多线程
 */
public class ThreadDemo3 extends Thread{

	public static void main(String[] args) {
		new ThreadDemo3().start();
	}
	
	public void run() {
		System.out.println("...........");
	}


}
