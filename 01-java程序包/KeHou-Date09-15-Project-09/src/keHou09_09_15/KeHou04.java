/**
 * 
 */
package keHou09_09_15;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*4.循环输入10个整数，统计这10个整数中有多少个偶数。*/
		Scanner ning = new Scanner(System.in);
		int B = 0;
		for (int A =1;A<=10;A++) {
			System.out.println("请输入第"+A+"个数：");
			int  C = ning.nextInt();
			if (C%2==0) {
				B++;
			}else {
			System.out.println(C+"不是偶数");
				continue;
			}
			
		}
			System.out.println("一共有"+B+"个偶数");
		
	}

}
