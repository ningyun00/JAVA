/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*8.猴子去买桃，
		 * 如果买 3 个以下，老板就不送桃，
		 * 如果买 3个到 5 个就再送一个桃，
		 * 如果买 5 个以上就送 2 个桃，
		 * 现在要求输入猴子的买桃数，
		 * 最后输出到底买到了几个桃？
		 */	
		System.out.print("请输入吉吉国王的买桃个数");
			int A = ning.nextInt();
		if(A<3) {
			System.out.print("老板不送桃"+"A");				
		}else if(A>=3&&A<=5) {				
			System.out.print(A=A+1);
		}else if(A>5) {				
			System.out.print(A=A+2);
		}

	}

}
