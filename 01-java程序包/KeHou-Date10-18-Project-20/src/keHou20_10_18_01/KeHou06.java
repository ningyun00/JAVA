package keHou20_10_18_01;

import java.util.Scanner;

/**
 * ����
 * @author ��
 *
 */
public class KeHou06 {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		//6.¼���û��� 18 λ���֤���룬������ȡ�û�������
		//ʵ��������
		Scanner ning = new Scanner(System.in);
		//�����ʾ
		System.out.print("�������֤�ţ�");
			//�����ַ��������
			String kt = new String(ning.next());
		//�ж��Ƿ���18λ����
		if (kt.length() == 18) {
			//��
			String no1 = kt.substring(6,10);
			//��
			String no2 = kt.substring(10,12);
			//��
			String no3 = kt.substring(12, 14);
			//���������
			System.out.println(no1+"-"+no2+"-"+no3);
		} else {
			//��ʽ����
			System.out.println("���֤���Ȳ���");
		}
		
	}

}
