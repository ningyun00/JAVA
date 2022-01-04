/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeTang03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		/*练习 3：
		 * 根据成绩发奖品输入王小明的数学成绩
		 * 1. 若成绩=100,奖励一台 iPad
		 * 2. 90<=成绩<100，奖励一双球鞋
		 * 3. 80<=成绩<90,奖励一辆自行车
		 */
			System.out.println("请输入你的成绩");
		int A = ning.nextInt();
		if (A==100) {
			System.out.print("奖励一台 iPad");
		}else if(A>=90&&A<100) {
			System.out.print("奖励一双球鞋");
		}else if(A>=80&&A<90) {
			System.out.println("奖励一辆自行车");
		}else {
			System.out.println("请输入有效成绩");
		}
		
		
		
		
		
		
		
	}

}
