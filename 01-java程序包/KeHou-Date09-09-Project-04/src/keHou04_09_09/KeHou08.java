/**
 * 
 */
package keHou04_09_09;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*8. 输入你的操作金额, 如果金额在20000以上则提示"操作失败! 
		 * 	 每日操作金额不得超过20000元", 
		 * 	 否则提示"操作成功! 请稍候..."
		 */	
		Scanner sc = new Scanner(System.in);
			System.out.print("请输入你的金额：");
				int A = sc.nextInt();
		if(A>20000) {
			System.out.println("操作失败!每日操作金额不得超过20000元");
		}else {
			System.out.println("操作成功! 请稍候...");
		}
		
	}

}
