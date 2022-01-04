/**
 * 
 */
package keHou07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int A = rd.nextInt(12)+1;
		// TODO 自动生成的方法存根
		/*7. 用随机器产生 1-12，
		 * 并对应输出相应的生肖名生肖顺序：
		 * 1 鼠 2 牛 3 虎 4 兔 5 龙 6 蛇
		   7 马 8 羊 9 猴 10 鸡 11 狗 12 猪。
		比如说：随机到 1，就输出："1 鼠"，
		随机到 7，就输出"7 马
		*/
		switch (A) {
		case 1:
			System.out.println("1 鼠");
			break;
		case 2:
			System.out.println("2 牛");
			break;
		case 3:
			System.out.println("3 虎");
			break;
		case 4:
			System.out.println("4 兔");
			break;
		case 5:
			System.out.println("5 龙");
			break;
		case 6:
			System.out.println("6 蛇");
			break;
		case 7:
			System.out.println("7 马");
			break;
		case 8:
			System.out.println("8 羊");
			break;
		case 9:
			System.out.println("9 猴");
			break;
		case 10:
			System.out.println("10 鸡");
			break;
		case 11:
			System.out.println("11 狗");
			break;
		case 12:
			System.out.println("12 猪");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
