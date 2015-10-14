/**
 * 
 */
package LangXin;

/**
 * @author Dahai
 * @Date 2015年10月10日
 * 实现Runnable接口的多线程
 */
public class ThreadDemo2 implements Runnable {
	public static void main(String[] args) {
			new Thread(new ThreadDemo2()).start();
	}
	public void run() {
		System.out.println("...........");
	}
}
