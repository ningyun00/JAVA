/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*6. 输入一个数 n, 比如 20
		 * 输出 n 到  100 之间能被 3 整除，
		 * 并且能被 2 整除的数。*/
		System.out.println("请输入一个数：");
		int A = sc.nextInt();
		while (A<=100) {
			if (A%3==0&&A%2==0) {
			System.out.println(A);
					}
			A++;
		}
		
	}

}
