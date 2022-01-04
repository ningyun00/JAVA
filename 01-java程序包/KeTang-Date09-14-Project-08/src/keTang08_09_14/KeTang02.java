/**
 * 
 */
package keTang08_09_14;

/**
 * @author EDZ
 *
 */
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*2. 求出 1-100 之间所有偶数*/
		int A = 0,B = 0;
		do {
			if(A%2==0) {
			B+=A;
			}A++;
		} while (A<=100);
		System.out.println(B);
		
	}

}
