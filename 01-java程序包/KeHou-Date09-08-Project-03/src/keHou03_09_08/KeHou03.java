/**
 * 
 */
package keHou03_09_08;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		System.out.println("输入天数");
			int A = sc.nextInt(),B,C;
			B = A / 7;C = A % 7;
		System.out.println(A+"天相当于"+B+"周余"+C+"天");
	}

}
