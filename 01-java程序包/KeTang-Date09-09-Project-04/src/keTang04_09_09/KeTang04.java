/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang04 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*4. 情景模拟: 一个女生问男生, 你Java成绩怎么样, 
		 * 		如果男生回答的分数在80以上,
		 * 	  女生就说"你教教我吧!"
		 * 		如果回答的分数在80分以下, 女生就说"你好好自习!"
		 */
		    System.out.println(" 你Java成绩怎么样，考了多少分：");
		int chengJi1 = sc.nextInt();
		if (chengJi1>80) {
			System.out.println("你教教我吧!");	 
		}else {
			System.out.println("你好好自习!");
		}
	}

}
