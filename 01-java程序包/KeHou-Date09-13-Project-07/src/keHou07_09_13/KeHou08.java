/**
 * 
 */
package keHou07_09_13;
import java.util.Random;
/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int A =rd.nextInt(100); 
		// TODO �Զ����ɵķ������
		/*8. ģ����Ϸ�еı����� 
		 * (ע: ������ʹ�ù���������)
		 * ��������ԭ��������Ϊ 88, 
		 * �ڹ���Ŀ������ʱ, 
		 * �� 30%�ļ��ʻ��������(88 * 2)
		 * ���ó���ģ��������������
		 */		
		if (A<=30) {
			System.out.println("��������"+88*2);
		}else {
			System.out.println("δ��������"+88);
		}
		
	}

}
