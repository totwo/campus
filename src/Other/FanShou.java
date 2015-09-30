/**
 * 
 */
package Other;

/**
 * @author Dahai
 * @Date 2015年9月29日
 * 翻手算法
 */
public class FanShou {
	public static void main(String[] args) {
		String str = "ABCDEFG";
		String result = new FanShou().process(str, 3);
		System.out.println(result);
	}
	public String process(String str, int m){
		char[] cs = str.toCharArray();
		turnHand(cs,0,m-1);
		turnHand(cs,m,cs.length-1);
		turnHand(cs,0,cs.length-1);
		return new String(cs);
	}
	public void turnHand(char[] cs,int i,int j){
		int length = j-i+1;
		for(int t=0;t<length/2;t++,i++){
			char temp = cs[i];
			cs[i] = cs[j-t];
			cs[j-t] = temp;
		}
	}
}
