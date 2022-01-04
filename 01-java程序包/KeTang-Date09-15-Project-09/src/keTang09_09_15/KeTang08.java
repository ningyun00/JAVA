/**
 * 
 */
package keTang09_09_15;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*8. 利用for输入网银登录密码,次数只有3次机会, 密码为zhangsan520*/
		Scanner ning = new Scanner(System.in);
				System.out.print("请输入密码：");
			String A = ning.next();
				for(int B=1;B<=4;B++) {
				if(A.equals("ningyun520")) {
					System.out.println("输入成功");
					break;
				}else {
				System.out.println("输入错误");
				System.out.print("请输入密码");
				A = ning.next();
			 }
		
		 }
			
	}

}
