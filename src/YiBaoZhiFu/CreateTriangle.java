/**
 * 
 */
package YiBaoZhiFu;

/**
 * @author Dahai
 * @Date 2015年10月14日
 * 从n个棍子中选出3个组成周长尽量长的三角形
 */
public class CreateTriangle {
	public static void main(String[] args) {
		int n = 0;
		int ans = 0;//存放最大周长
		int a[] = {3,6,7,2,4,5};
		int t;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					int len = a[i]+a[j]+a[k];//周长
					int max = ( ( t=(a[i]>a[j])?a[i]:a[j] ) > a[k])?  t:a[k]  ;//max(a[i],max(a[j],a[k]));
					int rest = len + max;
					if(max < rest)//两边只和大于第三边
						ans = (ans>len)?ans:len;
				}
			}
		}
		System.out.println(ans);
	}
}
