/**
 * 
 */
package keTang09_09_15;
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
		Scanner ning = new Scanner(System.in);
		
		// TODO 自动生成的方法存根
		/*4. (使用do..while写)
		 * 有个男孩子每天对心仪的女孩子问“你喜欢我吗？”
		 *  如果那女孩子说“不喜欢”就继续问“你喜欢我吗？”,
		 *  直到那女孩子说“喜欢”为止，男孩子就不问了。
		 */
		System.out.println("你喜欢我吗？");
		String A = ning.next();
		do {
			System.out.println("你喜欢我吗？");
			A =ning.next();
			A.equals("喜欢");
			break;
		} while (A.equals("不喜欢"));
		
	}

}
