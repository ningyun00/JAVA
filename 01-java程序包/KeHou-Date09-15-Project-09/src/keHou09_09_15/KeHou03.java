/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//3. ����1+3+5+7.......+99�ĺ�
	 int B = 0;
		for (int A = 1;A<=100;A++) {
			if (A%2!=0) {
				B+=A;
			}
		}
		System.out.println(B);
	}

}
