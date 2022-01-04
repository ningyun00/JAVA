/**
 * 
 */
package keTang08_09_14;

/**
 * @author EDZ
 *
 */
public class KeTang01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*1. 循环输出 1900-2017 年的闰年有哪些?
		 * (提示: 在循环内是可以用 if 进行判断的)
		 */
	int A=1900;
		while(A>=1900 && A<=2017) {
			if(A%4==0&&A%100!=0||A%400==0) {
				System.out.println(A);
			}A++;
		}
		
		
		
		
		
	}

}
