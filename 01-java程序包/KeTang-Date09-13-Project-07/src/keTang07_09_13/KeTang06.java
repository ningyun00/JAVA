/**
 * 
 */
package keTang07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeTang06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*6. 随机产生一种花色的扑克牌, 
		1 代表红桃, 2 代表黑桃,
	 	3,代表梅花, 4 代表方块
		再随机产生一个点数 
		A 2 3 .... 9 10 J Q K
		注: A J Q K 需要用数字
		(1 11 12 13)代替
		最后输出花色和点数的组合,
		例如: 随机的牌为黑桃
		*/
		Random rd1 = new Random();
			int A = rd1.nextInt(4)+1;//花色
		Random rd2 = new Random();
			int B = rd2.nextInt(13)+1;//A~K	
		System.out.println("1 代表红桃, 2 代表黑桃, 3,代表梅花, 4 代表方块");		
		System.out.println("A~K代表1~13");
		System.out.println(A);
		System.out.println(B);
		switch (A) {
		case 1:
			System.out.print("随机的牌为红桃");
			break;
		case 2:
			System.out.print("随机的牌为黑桃");
			break;
		case 3:
			System.out.print("随机的牌为梅花");
			break;
		case 4:
			System.out.print("随机的牌为方块");
			break;
			
		}
		switch(B) {
		case 1:
			System.out.print("A");
			break;
		case 2:
			System.out.print("2");
			break;
		case 3:
			System.out.print("3");
			break;
		case 4:
			System.out.print("4");
			break;
		case 5:
			System.out.print("5");
			break;
		case 6:
			System.out.print("6");
			break;
		case 7:
			System.out.print("7");
			break;
		case 8:
			System.out.print("8");
			break;
		case 9:
			System.out.print("9");
			break;
		case 10:
			System.out.print("10");
			break;
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
