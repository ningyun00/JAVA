package keHou20_10_18_01;

import java.util.Scanner;

/**
 * ����
 * @author ��
 *
 */
public class KeHou01 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1.Ҫ��ע����û������Ȳ���С�� 3��
		 * ���볤�Ȳ���С�� 6��
		 * ����ע�� ʱ������������������ͬ��
		 * �������Ҫ����ʾע��ɹ���
		 */
		//ɨ����
		Scanner ning = new Scanner(System.in);
		//�����ʾ
		System.out.print("�����û�����");
			//�����ַ������Ҹĳɶ�������
			String userName = new String(ning.next());
		//�����ʾ	
		System.out.print("�������룺");	
			//�����ַ������Ҹĳɶ�������
			String passWord = new String(ning.next());
		//�����ʾ
		System.out.print("�ٴ��������룺");
			//�����ַ������Ҹĳɶ�������
			String passWord1 = new String(ning.next());
		//�жϳ���
		if (userName.length()>3||passWord.length()>6) {
			//�ж����������Ƿ���ͬ
			if (passWord.equals(passWord1)) {
				System.out.println("����ɹ�");
			} else {
				System.out.println("�������벻ͬ");
			}
		} else {
			System.out.println("�û��������볤�Ȳ���");
		}	
		
	}

}
