/**
 * 
 */
package keHou03_09_08;
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
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入小时");
			double A = sc.nextDouble();
			double C;
			C=A/24;
		System.out.println(((int)(C))+"天");	
		System.out.println((int)(((A/24)-((int)(C)))*24)+"小时");
	}

}
