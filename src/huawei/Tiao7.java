/**
 * 
 */
package huawei;

import java.util.Scanner;

/**
 * @author Dahai
 * @Date 2015年9月28日
 */
public class Tiao7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		int count = 0;
		//TODO: 未完成
		for (int i = 0; i < a; i++) {
			if(  (7 << b) <= a){
				System.out.println( (7 << b));
				count++;
				b++;
			}else if( 10*i*7 != (7 << b)  ){
				
			}
		}
		
	}

}
