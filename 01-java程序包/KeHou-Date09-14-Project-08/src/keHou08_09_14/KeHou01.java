/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeHou01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		/*1. 首先输入班级人数(如 5 人), 
		 * 然后循环录入该人数学员的成绩，
		 * 计算班级学员的总分和平均分. 
		 * 格式如下:
		 * 请输入第 1 个同学的成绩:
		 * XX
		 * 请输入第 2 个同学的成绩:
		 * XX
		 * ... 请输入第 5 个同学的成绩:
		 * XX
		 * 总分: XXX 平均分: X
		 */
		 	int G = 0,C = 1;
		 	int H = 0;
				System.out.println("请输入人数：");
				int A = sc.nextInt();
			do {
				System.out.println("输入第"+C+"个人的成绩");
			int B = sc.nextInt();
				C++;//第几人
				H +=B;//总分
			} while (C<=A); {
				System.out.println("总分为"+H);
				G=H/A;//平均分
				System.out.println("平均分为"+G);
			}
	}

}
