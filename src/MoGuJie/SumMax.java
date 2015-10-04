/**
 * 
 */
package MoGuJie;

/**
 * @author Dahai
 * @Date 2015年10月3日
 * 子数组和的最大值
 * 输入一个整型数组,数组里有正数也有负数,数组中连续的一个或多个整数组成一个子数组,每个子数组都有一个和.
 * 求所有子数组的和的最大值.要求时间复杂度为O(n)
 */
public class SumMax {
	public static void main(String[] args) {
		int a[] = {1,-2,3,10,-4,7,2,-5};//最大的子数组为3,10,-4,7  和为18
		int b[] = {1,2,-10,3,-4,7,-3,5};//最大的子数组为7,-3,5  和为9
		System.out.println(getMaxSeq(a));
		System.out.println(getMaxSeq(b));
	}
	
	/**
	 * 要求时间复杂度为O(n)，即要求扫描一次数组得出最大值，想到要用空间换时间的动态规划思路，
	 * 在扫描数组时新建一对应数组，存放相应的最大值，扫描结束后返回最大值即可。
	 * @param a
	 * @return
	 */
	public static int getMaxSeq(int[] a){ //最大连续队列
        int[] sum = new int[a.length];
        sum[0]=a[0];
        int max = a[0];
        for(int i=1;i<a.length;i++){
        	//sum中前一项不为负值则sum[i-1]+a[i]是一定大于a[i]的,那么就可以继续累加了,
        	//若前一项为负的,那就不要累加前一项了.
            sum[i]=(sum[i-1]+a[i]>a[i])?sum[i-1]+a[i]:a[i]; //判断前一项是否为负值，存放最大值
            max = max>sum[i]?max:sum[i];                    //max记录最大值
        }
        return max;
    }

}
