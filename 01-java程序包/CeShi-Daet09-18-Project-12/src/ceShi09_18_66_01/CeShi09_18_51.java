package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_51 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*51. һ�����乫˾�涨��ÿ�����˷�Ϊ 2 Ԫ��������乫
		����С�� 100 ����Ĳ����ۣ����ڵ��� 100 ���ﲢС��
		500 ����Ĵ� 9 �ۣ����ڵ��� 500 ����Ĵ� 8 �ۡ���Ҫ
		������һ�����������������
		*/
		Scanner ning = new Scanner(System.in);
		System.out.print("�����빫������");	
			int A = ning.nextInt();
		if (A < 100) {
			System.out.println("������,�۸�Ϊ��"+(A*2));
		}
		if (A >= 100 && A < 500) {
			System.out.println("��9�ۣ��۸�Ϊ��"+(A*2*0.9));
		}
		if (A >= 500) {
			System.out.println("��8�ۣ��۸�Ϊ��"+(A*2*0.8));
		}

	}

}
