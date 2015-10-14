/**
 * 
 */
package MeiTuan;

/**
 * @author Dahai
 * @Date 2015年10月4日
 * 最长递增子序列
 * http://dsqiu.iteye.com/blog/1701494
 */
public class DiZengZiXuLieMax {
	public static void main(String[] args) {
		
	}
	
	public int LIS(int d[],int n){
		int b[] = new int[n];
		int left,right,mid,len=1;
		b[0]=b[1];
		for(int i=2;i<=n;++i){
			left = 0;
			right = 0;
			while(left <= right){
				mid = (left+right)/2;
				if(b[mid] < d[i]) left = mid+1;
				else right = mid-1;
			}
			b[left] = d[i];
			if(left > len) len++;
		}
		return len;
	}
	
}
