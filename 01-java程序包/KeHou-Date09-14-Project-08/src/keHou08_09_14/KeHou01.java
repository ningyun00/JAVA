/**
 * 
 */
package keHou08_09_14;
import java.util.Scanner;//����
/**
 * @author EDZ
 *
 */
public class KeHou01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);//ϵͳ¼��
		// TODO �Զ����ɵķ������
		/*1. ��������༶����(�� 5 ��), 
		 * Ȼ��ѭ��¼�������ѧԱ�ĳɼ���
		 * ����༶ѧԱ���ֺܷ�ƽ����. 
		 * ��ʽ����:
		 * ������� 1 ��ͬѧ�ĳɼ�:
		 * XX
		 * ������� 2 ��ͬѧ�ĳɼ�:
		 * XX
		 * ... ������� 5 ��ͬѧ�ĳɼ�:
		 * XX
		 * �ܷ�: XXX ƽ����: X
		 */
		 	int G = 0,C = 1;
		 	int H = 0;
				System.out.println("������������");
				int A = sc.nextInt();
			do {
				System.out.println("�����"+C+"���˵ĳɼ�");
			int B = sc.nextInt();
				C++;//�ڼ���
				H +=B;//�ܷ�
			} while (C<=A); {
				System.out.println("�ܷ�Ϊ"+H);
				G=H/A;//ƽ����
				System.out.println("ƽ����Ϊ"+G);
			}
	}

}
