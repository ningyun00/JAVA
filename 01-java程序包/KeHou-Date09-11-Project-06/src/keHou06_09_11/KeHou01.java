/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeHou01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//系统输入
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*一、使用 switch 结构实现：
		 * 为小明制定学习计划，
		 * 周一、周三、周五学习编程， 
		 * 周二、周四、周六学习英语，
		 * 周日休息。
		 * 输入星期几，输出学习内容
		 */
		
		System.out.println("请输入星期："); 
	int A = ning.nextInt();
		switch (A) {
		case 1,3,5:
			System.out.println("学习编程");
				break;
		case 2,4,6:
			System.out.println("学习英语");
				break;
		case 7:	
			System.out.println("休息");
				break;
		default:
			System.out.println("请输入有效星期，输入阿拉伯数字");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
