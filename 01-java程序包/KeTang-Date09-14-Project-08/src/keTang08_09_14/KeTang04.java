/**
 * 
 */
package keTang08_09_14;

/**
 * @author EDZ
 *
 */
public class KeTang04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*4. 求出 1-50 之间所有奇数的和*/
		int A = 0;
		int B = 0;
		do {
			A++;
				if(A%2!=0) {
					B+=A;
			}
		} while (A<50);
			System.out.println(B);
	}

}
