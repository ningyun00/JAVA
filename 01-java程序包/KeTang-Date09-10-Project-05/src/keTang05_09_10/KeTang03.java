/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*3.输入年龄和性别，
		 * 如果年龄大于等于 7 
		 * 或者年龄大于等于5 
		 * 并且性别是男，
		 * 则输出能搬动桌子，
		 * 否则输出不能搬动桌子。
		 */
			System.out.println("请输入你的年龄");
		int A = sc.nextInt();
			System.out.print("请输入你的性别");
		String B = sc.next();
		if(A>=7||A>=5 & B.equals("男")) {
			System.out.print("能搬动桌子");
		}else {
			System.out.print("不能搬动桌子");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
