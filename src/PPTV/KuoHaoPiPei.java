/**
 * 
 */
package PPTV;

import java.util.Stack;

/**
 * @author Dahai
 * @Date 2015年10月3日
 */
public class KuoHaoPiPei {
	public static void main(String[] args) {
		String string1 = "(1,(2,3),(4,(5,6),7))";
		String string2 = "(1,)2,3),(4,(5,6(,7))";
		System.out.println(delBrackets(string1));
		System.out.println(delBrackets(string2));
	}
	
	public static String delBrackets(String s){
		if(s == null) return null;
		StringBuffer buffer = new StringBuffer();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='(')  stack.push(c);//左括号进栈
			else if (c==')') {
				if( !stack.isEmpty() && stack.pop()=='(' )//有括号则判断栈是否为空和栈顶元素是不是左括号 
					continue;
				else 
					return "error";
			}else
				buffer.append(c);//数字加入buffer
		}
		
		if( stack.isEmpty() )
			return buffer.toString();
		return "error";
	}

}
