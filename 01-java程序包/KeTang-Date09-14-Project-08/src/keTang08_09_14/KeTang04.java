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
		// TODO �Զ����ɵķ������
		/*4. ��� 1-50 ֮�����������ĺ�*/
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
