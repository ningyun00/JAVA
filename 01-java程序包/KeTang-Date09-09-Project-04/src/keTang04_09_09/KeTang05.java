/**
 * 
 */
package keTang04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*5. 输入一个int型的数据，
		 * 		判断这个数是否能被2整除，
		 * 		如果能被2整除，
		 *		那么输出“这个数是偶数”，
		 * 		否则输出“这个数是奇数”。	
		 */
	
		 	System.out.println("请输入一个整数");
		int Q = sc.nextInt();		
	        
		boolean L;
	    if (Q%2==0) {
	    	System.out.println("这个数是偶数");
	      }else 
	      {
	    	System.out.println("这个数是奇数");
	      }  
	      
	}

}
