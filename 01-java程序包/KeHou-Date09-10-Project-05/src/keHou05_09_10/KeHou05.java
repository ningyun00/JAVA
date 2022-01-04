/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*6.一个运输公司规定，每公里运费为 20 元。
		 * 如果运输公里数小于 100 公里的不打折，
		 * 大于等于 100 公里并小于 500公里的打 9 折，
		 * 大于等于 500 公里的打 8 折。
		 * 现要求输入一个公里数，计算费用
		 */
		System.out.println("请输入公里数");
		 	double A = ning.nextInt();
		if(A==20) {
			System.out.println(A);
		}else if (A>=100 && A<500) {
			A=A*0.9;
			System.out.print(A);
		}else if(A>500){
			A=A*0.8;
			System.out.print(A);
		}
	
	}

}
