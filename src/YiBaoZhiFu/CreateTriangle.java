/**
 * 
 */
package YiBaoZhiFu;

/**
 * @author Dahai
 * @Date 2015年10月14日
 * 从n个棍子中选出3个组成周长尽量长的三角形
 * 写的比较暴力,直接三种循环
 */
public class CreateTriangle {
	public static void main(String[] args) {
		int ans = 0;//存放最大周长
		int a[] = {2,3,4,5,10};
		int n = a.length;
		int t;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					int len = a[i]+a[j]+a[k];//周长
					int max = ( ( t=(a[i]>a[j])?a[i]:a[j] ) > a[k])?  t:a[k]  ;//max(a[i],max(a[j],a[k]));
					int rest = len - max;//周长减最大的就是剩余的两条边
					if(max < rest)//两边之和大于第三边
						ans = (ans>len)?ans:len;
				}
			}
		}
		System.out.println(ans);
	}
}
