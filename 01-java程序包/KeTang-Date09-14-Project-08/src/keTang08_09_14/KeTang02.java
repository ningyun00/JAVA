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
		// TODO �Զ����ɵķ������
		/*2. ��� 1-100 ֮������ż��*/
		int A = 0,B = 0;
		do {
			if(A%2==0) {
			B+=A;
			}A++;
		} while (A<=100);
		System.out.println(B);
		
	}

}
