/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*3. ��ĩ�ɼ����:90 ������������, 
		 * 	80 ������������,
		 *	70 ���������е�,
		 *  60 �����ϲ��,
		 *  60 �����²�����
		 *  ��������Ǹ���,
		 *  ���з������� 100 ��,
		 *  ��˵��������,��������
		 */
		System.out.println("������ɼ�:");
			int A = ning.nextInt();
		if(A>100) {
			System.out.print("��������,��������");
		}else if (A>90) {
			System.out.print("����");
		}else if(A>80) {
			System.out.print("����");
		}else if(A>70) {
			System.out.print("�е�");
		}else if(A>60) {
			System.out.print("���");
		}else if(A<60){
			System.out.print("������");
		}else if(A<0){
			System.out.print("��������,��������");
		}
		
	}

}
