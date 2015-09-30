/**
 * 
 */
package Other;

/**
 * @author Dahai
 * @Date 2015年9月29日
 * 楼梯有n阶台阶，上楼可以一步上1阶，也可以一步上2阶，编一程序列出每一种走法。
 */
public class TaiJie {
	public static void main(String[] args) {
		System.out.println( "共有走法:" + count(4) );
	}
	
	public static int count(int n){
		if( n == 1)return 1;//最后只剩一个台阶就只有一种走法
		else if( n== 2)return 2;//最后只剩两个台阶就有两种走法
		else return (count(n-1) + count(n-2));
	}

}
