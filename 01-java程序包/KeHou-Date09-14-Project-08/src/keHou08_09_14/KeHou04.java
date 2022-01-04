/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*4. 输入一个整数放入到变量 n 中，
		 * 如果这个整数大于 0，
		 * 那么计算 1+2+3+……+n 的结果，
		 * 如果不大于  0 则输出数据有错误
		 */
		System.out.println("请输入一个整数");
		int A = sc.nextInt();
		if(A>0) {
		int B = 1;
		int C = 0;
			while(B<=A) {
			C+=B;
			B++;	
			}
				System.out.println(C);	
		}else {
				System.out.println("输入有误");
		}
			
		
	}

}
