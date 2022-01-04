/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		/*3. 输入两个小数，计算他们的和，如果和大于100，就输出这两个数整数部分的和，
		 * 	 如果和小于等于100，就输出这两个数小数部分的和
		 *	(提示: 
   		 *		得到整数部分： 如：int a=(int)10.5;      -- 结果值为10
   		 *		得到小数部分： 如：double b=10.5%1       -- 结果值为0.5
   		 */
		 	System.out.println("请输入两个小数");
		double A =sc.nextDouble();
		double B =sc.nextDouble();		
		double H ;
		int G ;
		if ((int) (A+B)>=100 ) {
			G = (int)(A+B);
		    System.out.println("得到整数部分：" +G);		 	
		    }else {
		double C = A%1,E = B%1;
			H = C+ E;
			System.out.println("得到小数部分：" +H);
		}

	}

}
