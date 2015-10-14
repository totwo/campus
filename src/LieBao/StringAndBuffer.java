/**
 * 
 */
package LieBao;

/**
 * @author Dahai
 * @Date 2015年10月14日
 * String与StringBuffer的区别
 */
public class StringAndBuffer {
	public static void main(String[] args) {
		String textString = new String("java");
		StringBuffer textBuffer = new StringBuffer("java");
		
		StringAndBuffer s = new StringAndBuffer();
		s.stringReplace(textString);//传值
		s.bufferReplace(textBuffer	);//传引用
		System.out.println(textString + textBuffer);
	}
	
	public void stringReplace(String text){
		text = text.replace('j', 'i');
	}
	
	public void bufferReplace(StringBuffer text){
		text = text.append("C");
	}

	//javajavaC
	
}
