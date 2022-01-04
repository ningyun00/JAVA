/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		/*使用 switch 模拟实现一个菜单选择功能
		 */
			System.out.println("学科类别列表：");
			System.out.println("1.语文");
			System.out.println("2.数学");
			System.out.println("3.英语");
			System.out.println("请输入你要选择的数字：");
	int A = ning.nextInt();
		switch (A) {
		case 1:
			System.out.println("你选择了语文");
			break;
		case 2:
			System.out.println("你选择了数学");
			break;
		case 3:
			System.out.println("你选择了英语");
			break;
		default:
			System.out.println("您输入的数字有误请核对");
			break;
		}
		
		

	}

}
