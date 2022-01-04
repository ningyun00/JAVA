/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner NING = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*4. 输入 3 个数字，
		 * 然后从大到小进行排列输出。
		 * 例如: 
		 * 分别输入 4, 6, 3,
		 * 输出6 4 3. 
		 */
		System.out.print("请输入三个数");
		System.out.println("第一个数为");
	int A = NING.nextInt();
		System.out.println("第二个数字为");
	int B = NING.nextInt();
		System.out.println("第三个数为");
	int C = NING.nextInt();
	if(A > B && A > C) {
		if(B > C) {
			System.out.println(A+""+B+""+C);
	}else {
		    System.out.println(A+""+C+""+B);
			}
	}
	if(B > C && B > A) {
		if(C > A) {
			System.out.println(B+""+C+""+A);
	}else if(A > C) {
		    System.out.println(B+""+A+""+C);
			}		
	}	
	if(C > A && C > B) {
		if(A > B) {
			System.out.println(C+""+A+""+B);
	}else if(B > A) {
			System.out.println(C+""+B+""+A);
			}
	}	
		
		
		
		
		
		
		
		
	}

}
