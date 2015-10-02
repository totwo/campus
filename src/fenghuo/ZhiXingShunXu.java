/**
 * 
 */
package fenghuo;

/**
 * @author Dahai
 * @Date 2015年9月25日
 * 代码执行顺序
 */
public class ZhiXingShunXu {
	public static String staticField = "静态变量";
	public String field = "变量";
	public static void main(String[] args) {
		new ZhiXingShunXu();
	}
	{
		System.out.println(field);
		System.out.println("初始化块..........");
	}
	static{
		System.out.println(staticField);
		System.out.println("静态初始化块");
	}
	{
		System.out.println(field);
		System.out.println("初始化块");
	}
	public ZhiXingShunXu(){
		System.out.println("构造器");
	}

}
