/**
 * 
 */
package keHou09_09_15;

/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*8������2008���1��1�գ�
		 * ��2008���9��1������ж����졣
		 * ����ʾ��
		 * ����������2�¾���29�죬
		 * ƽ���2����28��
		 * ��1��3��5��7��8��10��12�¶���31�죬
		 * 4��6��9��11�¶���30��
		 * ��*/
		int B = 0, C = 0;
		for (int A = 1;A<=9;A++) {
		if(A%2!=0||(A==8&&A!=9)) {			
		B++;
		}else if (A%2==0&&A!=2||A==9) {
		C++;
		}
		}
		int D = B*31,E = C*30;
		System.out.println((D+E+29-31));
		
	}

}
