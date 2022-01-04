/**
 * 
 */
package keHou05_09_10;
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
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*5.输入一个月份, 
		 * 输出对应月份的季节：
		 * 3,4,5 为春 
		 * 6,7,8 为夏 
		 * 9,10,11 为秋
		 * 12,1,2 为冬
		 */
			System.out.println("请输入月份");
		int A = ning.nextInt();
		if (A==3||A==4||A==5) {
			System.out.println("春季");
		}else if(A==6||A==7||A==8){
			System.out.println("夏季");
		}else if(A==9||A==10||A==11){
			System.out.println("秋季");
		}else if(A==12||A==1||A==2){
			System.out.println("冬季");
		}
		
	}

}
