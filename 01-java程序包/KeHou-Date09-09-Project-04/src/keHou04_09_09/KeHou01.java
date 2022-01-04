/**
 * 
 */
package keHou04_09_09;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou01 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*1. 输入盲僧和潘森的身高，然后比高矮，
		 * 如果盲僧高于潘森，
		 * 则输出“潘森是个矮子"否则输出"盲僧是个矮子"
		 */
		System.out.println("请输入盲僧的身高：");
			double A0 = sc.nextDouble();
		System.out.println("请输入潘森的升高：");
			double B0 = sc.nextDouble();
		if(A0>B0) {
			System.out.println("潘森是个矮子");
		}else  
		   	System.out.println("盲僧是个矮子");
	}
	
}