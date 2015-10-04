/**
 * 
 */
package LangXin;

/**
 * @author Dahai
 * @Date 2015年10月3日
 * 单例模式
 */
public class SingleClass {
	public static SingleClass singleClass;
	private SingleClass(){}//私有化构造方法
	
	public static SingleClass getInstance()
	{
		if (singleClass == null) {
			synchronized(SingleClass.class){
				if (singleClass ==null) 
					singleClass = new SingleClass();
			}
		}
		return singleClass;
	}
	public void sayHello(){
		System.out.println("hello,word!This is SingleClass");
	}
	public static void main(String[] args) {
		SingleClass.getInstance().sayHello();
	}

}
