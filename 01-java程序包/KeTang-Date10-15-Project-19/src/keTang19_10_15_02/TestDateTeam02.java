package keTang19_10_15_02;
/**
 * 导包
 */
import java.util.Scanner;
/**
 * 测试类
 * @author 寜
 *
 */
public class TestDateTeam02 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 实例化对象
		 */
		DateTeam02	date = new DateTeam02();
		Scanner ning = new Scanner(System.in);
		
		//1.
		date.XianShi();
		
		//2.
		System.out.print("输入起始年份：");
		date.QiShi = ning.nextInt();
		System.out.print("输入结束年份：");
		date.JeiShu = ning.nextInt();
		date.RunNian(0);
		
		//3.
		date.ShuRu();
		//4.
		date.YueFen("大月", "小月","平月");
		
		//5.
		System.out.print("输入月份：");
		date.YueFen(ning.nextInt());
		
		//6.
		System.out.print("输入出生年份：");
		date.ChengNian(ning.nextInt());
		
		//7.
		System.out.print("输入几月月份：");
		date.TianShu(ning.nextInt());
		
		//8.
		System.out.print("输入年份得出总天分：");
		date.NianFen(ning.nextInt());
	
	}

}
