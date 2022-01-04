/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*6. 输入你的操作金额, 
		 * 如果金额在 20000 以上则提示"操作失败! 
		 * 每日操作金额不得超过 20000 元", 
		 * 否则提示"操作成功! 
		 * 请稍候..
		 */
			System.out.println("请输入你的操作金额:");		
		int A = ning.nextInt();
	if(A>20000) {
			System.out.print("操作失败!每日操作金额不得超过 20000 元");
	}else {
			System.out.print("操作成功!请稍后...");
	}
		
		
		
		
		 
	}

}
