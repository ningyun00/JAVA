/**
 * 
 */
package keHou05_09_10;
import java.util.Scanner;
/**
 * @author EDZ
 *
 */
public class KeHou03 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ning = new Scanner(System.in);
		// TODO �Զ����ɵķ������
		/*4. ��Ů���� 3 ������:
		 * 1. ����������? �ش�"��/����" 
		 * 2. ���з�����? �ش�"��/û��" 
		 * 3. ���ж�����Ԫ���? �ش�����,
		 * ��������: 500 (���� 500 ��)
		 * ��������еĲ����з���
		 * ������Ĵ���� 500 ������
		 * ����������Ů, 
		 * ����Ů��˵�޸���, 
		 * ��Ȼ��˵���߿�
		 */
		System.out.print("����������?�ش���/����");
			String A = ning.next();
		System.out.println("���з�����?�ش���/û��");
			String B = ning.next();
		System.out.println("���ж�����Ԫ���?�ش�����");
			int C = ning.nextInt();
		if (!(A.equals("��") && A.equals("��"))) {
			System.out.println("�޸���");
		} else if (C > 50) {
			System.out.println("��Ҫ�޸���");
		} else {
			System.out.println("��Զ��");
		}
		
	}

}
