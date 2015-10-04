/**
 * 
 */
package LangXin;

/**
 * @author Dahai
 * @Date 2015年10月3日
 * 多线程
 */
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		for (int i = 0; i < 20; i++) {
			new Thread(myThread,"thread"+i).start();
			Thread.sleep(300);
		}
	}

}

class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}