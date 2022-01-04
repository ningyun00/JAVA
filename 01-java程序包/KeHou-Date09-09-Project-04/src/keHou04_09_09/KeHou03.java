/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		/*3. 输入两个整数，计算他们的和，
		 *	 如果和大于100，
		 *	 就输出这两个数的乘积，
		 * 	 否则，就输出这两个数的商
	     */
		System.out.println("请输入两个整数：");
		System.out.println("第一个整数：");
			int B = sc.nextInt();
		System.out.println("第二个整数");
			int C = sc.nextInt();
		    int O;
		    int P;
		if(( B + C ) > 100) {
			O = B*C;
		System.out.println(O);	
		}else {
			P =B/C;		
		System.out.println(P);	
		}
		
	}

}
