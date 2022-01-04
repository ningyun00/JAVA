/**
 * 
 */
package keHou06_09_11;
import java.util.Scanner;//导包
/**
 * @author EDZ
 *
 */
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		/*四、计算今年 1 月 1 日到今天的总天数
		 */
		System.out.println("请输入年份：(计算范围在1~9月)");
			int C = ning.nextInt();		
		System.out.println("请输入今天是这个月的第几天：");
			int A;
			int B = ning.nextInt();
		if(B%4==0&&B%100!=0||B%400==0) {
			A=B+(5*31)+(2*30)+29;
			System.out.println("今天是今年(自"+C+"年1月1日起)到今天的天数"+A);
		}else{
			A=B+(5*31)+(2*30)+28;
		}
		System.out.println("今天是今年(自"+C+"年1月1日起)到今天的天数"+A);		
	}

}
