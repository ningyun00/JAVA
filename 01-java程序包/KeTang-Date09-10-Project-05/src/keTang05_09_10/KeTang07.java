/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*7. 对任意输入的整数,
		 * 判断其是否能被 11 还有 3 整除,
		 * 如果能被11还有3整除输出
		 * "该数满足要求",
		 * 否则输出信息
		 * "该数不满足要求"
		 */
		System.out.println("请输入任意一个整数");
	int A = ning.nextInt();
	if(A%11==0) {
		if(A%3==0) {
		System.out.println("该数满足要求");	
		}else {
		System.out.println("该数不满足要求");	
		}
		}else {
		System.out.println("该数不满足要求");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
