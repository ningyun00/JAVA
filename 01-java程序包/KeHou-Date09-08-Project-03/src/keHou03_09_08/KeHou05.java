/**
 * 
 */
package keHou03_09_08;
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
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入衣服价格：");
			int A =sc.nextInt();
		System.out.println("购买了几件:");
			int B =sc.nextInt();
		System.out.println("请输入帽子个数");
			int C =sc.nextInt();
		System.out.println("购买了几个");
			int D =sc.nextInt();
		System.out.println("支付钱多少钱");
			int E =sc.nextInt();
		System.out.println(E-(D*C)+(B*A));	
	}

}
