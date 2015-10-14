/**
 * 
 */
package MeiTuan;

/**
 * @author Dahai
 * @Date 2015年10月4日
 * 两个数组中指定位置最大的元素
 * 给定两个已经从小到大排好序的整数数组A和B,请实现函数找到A和B中第K大元素.
 * 举例:  A=[1,2,3]  B=[2,4,6]  当k=1,  返回6,  k=2,返回4
 * 
 * 应该是两个数组中所有元素合在一起构成的数组中的第K大元素.
 */
public class KMaxNum {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {2,4,6};
		int k = 2;
		System.out.println( getMax2(a, b, k-1) );
		
	}
	
	public int getMax(int a[], int b[],int k){
		if (k <= a.length && k <= b.length)
			return a[a.length-1] > b[b.length-1]? a[a.length-1] : b[b.length-1];
		else 
			return -1111;
	}
	
	/**
	 * 思路:将两个数组按从大到小合成一个,合到第k大就停止
	 * @param a
	 * @param b
	 * @param k
	 * @return
	 */
	public static int getMax2(int a[], int b[],int k){
		int c[] = new int[a.length+b.length];
		int m = 0;
		int i = a.length-1;
		int j = b.length-1;
		while( i>=0 && j>=0){
			if (a[i] >= b[j]) {
				c[m] = a[i];
				m++;
				i--;
			}else {
				c[m] = b[j];
				m++;
				j--;
			}
			if ( (m-1) == k) {
				return c[m-1];
			}
		}
		if(i >=0){
			for (int t = i; t >= 0; t--) {
				c[m] = a[t];
				m++;
				if ( (m-1) == k) {
					return c[m-1];
				}
			}
		}else if(j >= 0) {
			for (int t = j; t >= 0; t--) {
				c[m] = b[t];
				m++;
				if ( (m-1) == k) {
					return c[m-1];
				}
			}
		}
		return -11111111;
		
		
	}

}
