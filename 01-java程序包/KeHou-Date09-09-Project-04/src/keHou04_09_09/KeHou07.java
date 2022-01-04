/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*7. 输入两个整数放在a和b内，
		 * 	 并判断a是否能被b整除，
		 *   就输出能整除，
		 *   否则输出不能整除		
		 */
			System.out.print("请输入两个整数");
			System.out.println("第一个数");
	    		int A1 = sc.nextInt();
	    	System.out.println("第二个数");
	    		int B1 = sc.nextInt();
	    if(A1%B1==0) {
	    	System.out.println("能整除");
	    }else {
	    	System.out.println("不能整除");
	    }	
		
	}

}
