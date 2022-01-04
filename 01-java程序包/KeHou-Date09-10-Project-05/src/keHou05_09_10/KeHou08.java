/**
 * 
 */
package keHou05_09_10;
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
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*3. 期末成绩打分:90 分以上是优秀, 
		 * 	80 分以上是良好,
		 *	70 分以上是中等,
		 *  60 分以上差等,
		 *  60 分以下不及格，
		 *  如果分数是负数,
		 *  还有分数超过 100 分,
		 *  则说分数错误,不予评级
		 */
		System.out.println("请输入成绩:");
			int A = ning.nextInt();
		if(A>100) {
			System.out.print("分数错误,不予评级");
		}else if (A>90) {
			System.out.print("优秀");
		}else if(A>80) {
			System.out.print("良好");
		}else if(A>70) {
			System.out.print("中等");
		}else if(A>60) {
			System.out.print("差等");
		}else if(A<60){
			System.out.print("不及格");
		}else if(A<0){
			System.out.print("分数错误,不予评级");
		}
		
	}

}
