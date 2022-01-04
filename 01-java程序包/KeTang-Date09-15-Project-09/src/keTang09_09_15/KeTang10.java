/**
 * 
 */
package keTang09_09_15;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*10. (使用do..while写)你的QQ密码是: woaini520 , 
		 * 在登录QQ的时候 , 
		 * 如果密码输入错误就一直循环重新输入*/
		Scanner ning = new Scanner(System.in);
			System.out.println("请输入你的密码：");
				String A = ning.next();
			do {
				A.equals("woaini520");
				System.out.println("请重新输入");
				A = ning.next();
				} while (!A.equals("woaini520"));
				System.out.println("密码正确");
		
		
		
		
		
		
		
		
		
	}

}
