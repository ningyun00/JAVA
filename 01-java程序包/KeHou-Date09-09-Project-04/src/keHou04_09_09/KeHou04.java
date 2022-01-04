/**
 * 
 */
package keHou04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		/*4. 输入3个数字，
		 * 	 求3个数字的最小值。
		 */
			int min;
		System.out.println("请输入三个数字");
		System.out.println("第一个数：");
			int D = sc.nextInt();
		System.out.println("第二个数");
			int E = sc.nextInt();
		System.out.println("第三个数");
			int F = sc.nextInt();
		if(D<E&&D<F) {
				System.out.println("最小值："+D);
		}
		if(F<E&&F<D) {
				System.out.println("最小值："+F);
		}
		if(E<F&&E<D) {
				System.out.println("最小值："+F);
		}
		
	}

}
