/**
 * 
 */
package Other.XianJing;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 遍历容器的陷阱
 * 使用迭代器时,错误的删除不通过编译
 */
public class VisotorGood {
	public static void main(String[] args) {
		Vector v = new Vector();
        v.add("one");
        v.add("two"); 
        v.add("three"); 
        v.add("four");
        Iterator iter = v.iterator();
        while (iter.hasNext()){
            String s = (String) iter.next();
            if (s.equals("two"))
//            	iter.remove("two");//会报错的
            	iter.remove();
            else{
                System.out.println(s);
            }
        }
        System.out.println("What's really there...");
        iter = v.iterator();
        while (iter.hasNext()){
            String s = (String) iter.next();
            System.out.println(s);            
        }
	}
}
