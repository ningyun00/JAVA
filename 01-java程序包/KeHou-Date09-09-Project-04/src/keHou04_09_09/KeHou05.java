/**
 * 
 */
package keHou04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		/*5. 输入两个数字分别存进两个变量, 
		 *   要求将相对比较大的数字输出
		 */
			double max;
		System.out.println("请输入两个数字");
   		System.out.println("第一个数为");				
   			double G = sc.nextDouble();
   		System.out.println("第二个数为");
		   double H = sc.nextDouble();
		if(G<H) {
		    max = H;
	    System.out.println("较大的数"+H);
		}else {
		    max = G;
		System.out.println("较大的数"+G);	
		}
		
	}

}
