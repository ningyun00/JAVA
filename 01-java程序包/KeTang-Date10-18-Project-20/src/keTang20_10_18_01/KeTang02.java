package keTang20_10_18_01;

import java.util.Scanner;
/**
 * ����
 * @author ��
 *
 */
public class KeTang02 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		//ɨ����
		Scanner ning = new Scanner(System.in);
		//2.����һ���û�������һ�����룬�����ַ������棬�ж�����û����������Ƿ񶼵���HelloJava�������ִ�Сд��
		// �������Ⱦ���� ����¼�ɹ������������"�û������������"��
		System.out.print("�����û�����");
			//�ַ�������
			String yuName = new String(ning.next());
		System.out.print("�������룺");
			//�ַ�������
			String miMa = new String(ning.next());
		if (yuName.equalsIgnoreCase("HelloJava") && miMa.equalsIgnoreCase("HelloJava")) {
			System.out.println("������ȷ");
		} else {
			System.out.println("�û������������");
		}
		
	}

}
