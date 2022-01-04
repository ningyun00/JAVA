/**
 * 
 */
package keTang05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeTang08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/*8. 输入一个年份,判断该年份是否为闰年,
		 * 	如果是则输出"该年份为闰年",
		 * 	否则输出"该年份为平年" 
		 * 	闰年的规则: 
		 * 	能被 4 整除但是不能被 100 整或者能被 400 整
		 */
			System.out.print("输入一个年份");
	int A = ning.nextInt();
	    if(A%4==0&&A%100!=0||A%400==0) {
	    	System.out.println("该年份为闰年");		
	    }else {
	    	System.out.print("该年份为平年");
	    }
	
		
		
		
		
		
		
		
		
		
	}

}
