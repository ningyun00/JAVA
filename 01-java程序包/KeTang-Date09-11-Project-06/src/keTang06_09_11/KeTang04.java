/**
 * 
 */
package keTang06_09_11;
import java.util.Scanner;//导包
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
		/*练习 4：
		 * 输入某年某月某日，判断这一天是这一年的第几天？
		 * 实现思路： 
		 * 以 3 月 5 日为例，
		 * 先把 1、2 月的天数累加起来，
		 * 再加上 5 天既本年的第几天。
		 * 2 月还需要判断是否闰年
		 */
	int D = 0;	
			System.out.print("请输入年份：");
	int A = ning.nextInt();	//假如为：2015年
			System.out.print("请输入月份：");
	int B = ning.nextInt();	//假如为：2月
			System.out.print("请输入日数：");
	int C = ning.nextInt();	//假如为：1
		if (A%4==0&&A%100!=0||A%400==0) {
		switch (B) {
		case 1:
			D=C;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;	
		case 3:
			D=C+31+29;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 5:
			D=C+31+29+31+30;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 7:
			D=C+31+29+31+30+31+30;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 8:
			D=C+31+29+31+30+31+30+31;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 10:
			D=C+31+29+31+30+31+30+31+30;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 12:
			D=C+31+29+31+30+31+30+31+31+30+31+30;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 4:
			D=C+31+29+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 6:
			D=C+31+29+31+30+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 9:
			D=C+31+29+31+30+31+30+31+30;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 11:
			D=C+31+29+31+30+31+30+31+30+30+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 2:
			D=C+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
			}
		}else {
			switch(B){
		case 1:
			D=C;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 3:
			D=C+31+28;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 5:
			D=C+31+28+31+30;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 7:
			D=C+31+28+31+30+31+30;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 8:
			D=C+31+28+31+30+31+30+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 10:
			D=C+31+28+31+30+31+30+31+31+30;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 12:
			D=C+31+28+31+30+31+30+31+31+30+31+30;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 4:
			D=C+31+28+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 6:
			D=C+31+28+31+30+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 9:
			D=C+31+28+31+30+31+30+31+30;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 11:
			D=C+31+28+31+30+31+30+31+30+30+31;
			System.out.println(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
		case 2:
			D=C+31;
			System.out.print(A+"年"+B+"月"+C+"日是第"+D+"天！");
			break;
			}
			
		}
		
	}
	
}
