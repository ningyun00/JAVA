/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*6.���10000-99999��������л�������
		 * ˵����
		 * ��12321�ǻ�������
		 * ��λ����λ��ͬ��
		 * ʮλ��ǧλ��ͬ��
		 */
		
		for(int A=10000;A<=99999;A++) {
			int B = A/10000;
			int C = A/1000%10;
			int D = A/10/10%10;
			int E = A/10%10;
			int F = A%10;
			if (B==F &&C==E) {
				System.out.println(A);
			}
			
			
			
			
			
			
			
			
			
		}
	}

}
