/**
 * 
 */
package keHou08_09_14;

/**
 * @author EDZ
 *
 */
public class KeHou05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*5. ��� 10000-99999 ֮��Ļ�����
		 * ������: 12321 45654 71517
		 */
		int A = 10000;//12345
		while (A<=99999) {
			int B = A/10000;
			int C = A/1000%10;
			int D = A/10/10%10;
			int E = A/10%10;
			int F = A%10;
			if(B==F&&C==E) {
			System.out.println(A);
				}
			A++;
			}
	
		
		
		
		
	}

}
