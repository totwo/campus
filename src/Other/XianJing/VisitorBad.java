/**
 * 
 */
package Other.XianJing;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 遍历容器的陷阱
 */

public class VisitorBad {
	public static void main(String[] args) {
        Vector v = new Vector();
        v.add("one");
        v.add("two");
        v.add("three"); 
        v.add("four");
        Enumeration enume = v.elements();
        while (enume.hasMoreElements()){
            String s = (String) enume.nextElement();
            if (s.equals("two"))
                v.remove("two");//two移除后,three相当于前移了一个,下个自然是遍历four了
            else{
                System.out.println(s);
            }
        }
        System.out.println("What's really there...");
        enume = v.elements();
        while (enume.hasMoreElements()){
            String s = (String) enume.nextElement();
            System.out.println(s);            
        }
	}
}
/**
 * 
one
four
What's really there...
one
three
four
 */




