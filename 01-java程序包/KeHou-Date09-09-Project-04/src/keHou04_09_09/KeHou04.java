/**
 * 
 */
package keHou04_09_09;
/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeHou04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		/*4. ����3�����֣�
		 * 	 ��3�����ֵ���Сֵ��
		 */
			int min;
		System.out.println("��������������");
		System.out.println("��һ������");
			int D = sc.nextInt();
		System.out.println("�ڶ�����");
			int E = sc.nextInt();
		System.out.println("��������");
			int F = sc.nextInt();
		if(D<E&&D<F) {
				System.out.println("��Сֵ��"+D);
		}
		if(F<E&&F<D) {
				System.out.println("��Сֵ��"+F);
		}
		if(E<F&&E<D) {
				System.out.println("��Сֵ��"+F);
		}
		
	}

}
