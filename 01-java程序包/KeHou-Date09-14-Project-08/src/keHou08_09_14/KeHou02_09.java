/**
 * 
 */
package keHou08_09_14;

/**
 * @author EDZ
 *
 */
public class KeHou02_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*2. ��� 100-999 ֮���ˮ�ɻ���
		 *  153��370��371��407
		 *  ˮ�ɻ���: 1*1*1+5*5*5+3*3*3 = 15*/
		//1.��ʼ������ֵ
				int  n=100;
				//2.ѭ�����ж�����
				while(n<999) {
					int A=n%10;
					int B=n/10%10;
					int C=n/10/10%10;
					/*������ʮ�ٵ����������==n*/
					if((A*A*A)+(B*B*B)+(C*C*C)==n) {
						//3.���ѭ�������
						System.out.println(n);
					}
					//4.����ѭ�����
					n++;
				}
			
		
	}

}
