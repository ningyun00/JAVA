/**
 * 
 */
package keTang04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*6. 输入两个整数，然后输出二者的最大值。
		 */ 
	    int max;
			System.out.print("请输入两个整数,");
			System.out.println("请输入第一个数:");
		int zhengShu1 = sc.nextInt();
		    System.out.println("请输入第二个数:");
		int zhengShu2 = sc.nextInt();
		if (zhengShu1>zhengShu2) {
		    max = zhengShu1;
		
		}else
			max = zhengShu2;
		    System.out.println("您输入的两个数最大值为："+max);
	}

}
