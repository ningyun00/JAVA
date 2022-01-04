/**
 * 
 */
package keTang09_09_15;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*9. 利用for循环录入某学生5门课的成绩并计算平均分，
		 * 如果某分数录入时为负数，则停止录入并提示录入错误
		 * */	
		Scanner ning = new Scanner(System.in);
				double C =0, E = 0;
				System.out.println("输入第"+1+"门成绩");
			 int A = ning.nextInt();
			 int D = A;
		for (int B = 2;B<=5;B++) {
			if (A>=0&&A<100) {
				System.out.println("第"+B+"门");
				 A = ning.nextInt();	
			C=C+A;
			}else {
				System.out.println("输入错误");
				break;
			}
		}			
		E=C+D;
		System.out.println(E/5);
		
		
		
		
		
		
		
		
		
	}

}
