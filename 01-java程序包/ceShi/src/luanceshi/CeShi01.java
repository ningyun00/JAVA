/**
 * 
 */
package luanceshi;
import java.util.Random;//随机数
import java.util.Scanner;//扫描仪
/**
 * @author EDZ
 *
 */
public class CeShi01 {

	/**
	 * @param args
	 */
	int C;
	public static void main(String[] args) {
		Random yun = new Random();//随机数对象
		Scanner ning = new Scanner(System.in);//系统录入
		// TODO 自动生成的方法存根
		int A =yun.nextInt(3)+1;
			System.out.print("请出拳（1代表石头，2代表剪刀，3代表布）");
		int B =ning.nextInt();
			switch (B) {
			case 1:
				System.out.println("你出的是石头");
				break;
			case 2:
				System.out.println("你出的是剪刀");
				break;
			case 3:
				System.out.println("你出的是布");
				break;	
			default:
				System.out.println("输入错误");
			}	
			System.out.println("电脑出拳");
			switch (A) {
			case 1:
				System.out.println("电脑出的是石头");
				break;
			case 2:
				System.out.println("电脑的是剪刀");
				break;
			case 3:
				System.out.println("电脑出的是布");
				break;		
			}int C =A-B;
			switch (C) {
			case -1:
			case 2:
				System.out.println("你赢了");
				break;
			case 0:
				System.out.println("平局");
				break;
			case 1:
			case -2:
				System.out.println("你输了");
				break;
			
			}
	}

}
