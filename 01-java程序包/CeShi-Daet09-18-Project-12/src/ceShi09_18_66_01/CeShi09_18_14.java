package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_14 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*14. һ�����乫˾�涨��ÿ�����˷�Ϊ 20 Ԫ��������乫
		����С�� 100 ����Ĳ����ۣ����ڵ��� 100 ���ﲢС��
		500 ����Ĵ� 9 �ۣ����ڵ��� 500 ����Ĵ� 8 �ۡ���Ҫ
		������һ����������������á�*/
		Scanner ning = new Scanner(System.in);
			double B;
			System.out.println("�����빫������");
				int A = ning.nextInt();
		if(A < 100) {
			B = 20*A;
			System.out.println("�����۷���Ϊ"+B);
		} else if (A < 500 && A >= 100) {
			B = 20*A*0.9;
			System.out.println("����Ϊ"+B);
		} else if (A >= 500) {
			B = 20*A*0.8;
			System.out.println("����Ϊ"+B);
		}
			
	}

}
