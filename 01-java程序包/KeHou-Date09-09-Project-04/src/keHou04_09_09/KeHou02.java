/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		/*2. 从键盘输入你的java成绩,然后判断：
		 *	 如果java成绩大于90分，
		 *	 那么输出“奖励你一个Mp3”
		 *	 否则，输出“罚你跑步” 
   		 */
		System.out.println("请输入你的java成绩:");
			double A = sc.nextDouble();
		if(A>90) {
				System.out.println("奖励你一个Mp3");
		}else {
				System.out.println("罚你跑步");	
		}
		
	}

}
