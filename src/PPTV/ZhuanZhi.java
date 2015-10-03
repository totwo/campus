/**
 * 
 */
package PPTV;

/**
 * @author Dahai
 * @Date 2015年10月3日
 * 矩阵转置
 */
public class ZhuanZhi {
	public static void main(String[] args) {
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		matrixTrans(a);
	}
	
	/**
	 * 转置矩阵的实现:设a为原始二维数组，则转置后的矩阵b[i][j]=a[col-1-j][i]，其中col是列数。
	 * @param a
	 */
	public static void matrixTrans(int a[][]){
		int row = a.length;
		int col = a[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[col-1-j][i]+" ");
			}
			System.out.println();
		}
	}

}
