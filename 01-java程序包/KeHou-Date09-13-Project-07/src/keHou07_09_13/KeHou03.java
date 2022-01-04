/**
 * 
 */
package keHou07_09_13;
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
		// TODO 自动生成的方法存根
		/*3. 输入循环次数, 循环执行"我很棒, 我很厉害"
		 */
		Scanner ning = new Scanner(System.in);//系统输入
		System.out.println("输入循环次数");
	int A = ning.nextInt();//变量
	int B = 1;//变量
		while(B<=A) {//循环
		System.out.println("我很棒, 我很厉害。");//结果
		B++;//自加
		}
	}

}
