/**
 * 
 */
package Sina;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dahai
 * @Date 2015年10月4日
 * ArrayList()  与  HashSet的区别
 */
public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("a");
		
		
		Set set = new HashSet();//重复的不加入
		set.add("a");
		set.add("b");
		set.add("a");
		System.out.println(list.size() + "," +set.size());
		
		
		System.out.println(  (7 << 1) & 15 );
		
	}

}
