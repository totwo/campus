/**
 * 
 */
package HuaShu;

/**
 * @author Dahai
 * @Date 2015年10月2日
 * 常见的七种排序算法：快速、归并、堆、选择、冒泡、插入和希尔。
 */
public class Sort {
	public static void main(String[] args) {
		int a[] = {213,45,67,234,5};
//		bubbleSort(a);
		
//		selectSort(a);
		
//		insertSort(a);
		
		shellSort(a);
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	/**
	 * 冒泡排序
	 * @param a
	 * 还可以加一个是否排好的标识
	 */
	public static void bubbleSort(int a[]){
		int tmp;
		for (int i = a.length-1; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if(a[j] >a[j+1]){
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
	
	/**
	 * 选择排序
	 * 每次选出最大或者最小的数字来,放到数组的开头或者末尾
	 * @param a
	 */
	public static void selectSort(int a[]){
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = i+1; j < a.length; j++) {
				if( a[k]>a[j] ) k=j;
			}
			if (k != i) {
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
	
	/**
	 * 插入排序
	 * 依次选择一个未排好序的数,以已经排好序的由高到低开始比较,如果选择的数字比正在比较的数字小,则
	 * 正在比较的数字往后移一个,并且继续与前一个比较
	 * @param a
	 */
	public static void insertSort(int a[]){
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			for (j = i-1; j >= 0 && temp < a[j]; j--) {
					a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
	}
	
	/**
	 * 希尔排序
	 * 先将整个待排元素序列分割成若干个子序列（由相隔某个“增量”的元素组成的）分别进行直接插入排序，
	 * 然后依次缩减增量再进行排序
	 * @param a
	 */
	public static void shellSort(int a[]){
		int gap = 0;
		while(gap <= a.length){//改进版insert排序，增加gap跨区域排序
			gap = gap*3 +1;
		}
		while(gap >0){
			for (int i = gap; i < a.length; i+=gap) {
				int temp = a[i];
				int j;
				for (j = i-gap;  j>=0&&temp< a[j]; j-=gap) {
					a[j+gap] = a[j];
				}
				a[j+gap	] = temp;
			}
			gap = (gap-1)/3;
		}
	}
	
	/**
	 * 快速排序
	 * @param a
	 * @param low   数组开始的位置,也是选择的基准数字
	 * @param high  数组最后的位置
	 * 1．先从数列中取出一个数作为基准数。
	 *	2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
	 * 3．再对左右区间重复第二步，直到各区间只有一个数。
	 */
	public static void quickSort(int[] a,int low,int high){
        if(low >=high){
            return;
        }
        int start = low;
        int end = high;
        int temp = a[low];
        while(low<high){
            while(low<high && a[high]>temp){// 从右向左找第一个小于x的数
                high--;
            }
            a[low] = a[high];
            while(low<high && a[low]<temp){// 从左向右找第一个大于等于x的数 
                low++;
            }
            a[high]=a[low];
        }
        a[low] = temp;
        quickSort(a,start,low-1);
        quickSort(a,low+1,end);
    }
	
	/**
	 * 归并排序
	 * 把原始数组分成若干子数组,对每一个子数组进行排序,
	 * 继续把子数组与子数组合并,合并后仍然有序,直到全部合并完,形成有序的数组
	 * @param a
	 * @param start
	 * @param end
	 */
	public static void mergeSort(int[] a,int start,int end){//分治法
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(a,start,mid); //递推排序
            mergeSort(a,mid+1,end);
            merge(a,start,mid,mid+1,end);
        }
    }
    private static void merge(int[] a, int start, int mid, int i, int end) {
        int m = start;
        int temp[] = new int[end-start+1];
        int k = 0;
        while(start<=mid&&i<=end){
            if(a[start]<a[i]){
                temp[k++] = a[start++];
            }else{
                temp[k++] = a[i++];
            }
        }
        while(start<=mid){
            temp[k++] = a[start++];
        }
        while(i<=end){
            temp[k++] = a[i++];
        }
        for(int element:temp){//将排好的数组替换以前的
            a[m++] = element;
        }
    }
    
    /**
     * 堆排序(不稳定):这个排序面试问的最多，务必要手写出来
     * @param a
     */
    public static void heapSort(int[] a){
        createMaxHeap(a);
        for(int i=a.length-1;i>0;i--){
            int temp = a[0];
            a[0]=a[i];
            a[i]=temp;
            maxHeap(a,1,i);
        }
    }
    private static void createMaxHeap(int[] a) {
        int startNode = a.length/2; 
        for(int i = startNode;i>0;i--){
            maxHeap(a,i,a.length);
        }
    }
    private static void maxHeap(int[] a, int startNode, int length) {
        int leftNode = 2*startNode;
        int rightNode = 2*startNode+1;
        int maxNode = startNode;
        if(leftNode<=length&&a[leftNode-1]>a[startNode-1]){//只考虑length以内的家族,数组与节点相差1
            maxNode = leftNode;
        }
        if(rightNode<=length&&a[rightNode-1]>a[maxNode-1]){
            maxNode = rightNode;
        }
        if(maxNode!=startNode){
            int temp = a[maxNode-1];
            a[maxNode-1]=a[startNode-1];
            a[startNode-1]=temp;
            maxHeap(a,maxNode,length);//调整交换后的最大值对其孩子的影响
        }
    }
	
	
}






















