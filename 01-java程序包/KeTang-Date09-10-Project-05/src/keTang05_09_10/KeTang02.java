/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*2. 输入 3 个分数, 
		 * 		如果 3 个分数中最大值超过 80 分
		 * 		同时最小值超过 60 分, 
		 * 		则输出"本次考试分数很好", 
		 * 		否则"本次考试分数不理想"
		 */
			System.out.println("请输入三个分数");
			System.out.print("请输入第一个分数");
		double A = sc.nextDouble();
			System.out.print("请输入第二个分数");
		double B = sc.nextDouble();
			System.out.print("请输入第三个小数");
		double C = sc.nextDouble();
		if(A>80 && B>60 && C>60||A>60 && B>80 
			    && C>60||A>60 && B>60 && C>80 ) {
			System.out.print("本次考试分数很好");
		}else {
			System.out.print("本次考试分数不理想");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
