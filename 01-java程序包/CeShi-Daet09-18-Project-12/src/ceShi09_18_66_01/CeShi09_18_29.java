package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_29 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*29. ��ɺɺ�μ��� JAVA �γ�ѧϰ����ĸ��ŵ�����Գɼ�
		==100 �֣�ĸ�׸�����һ���������Գɼ�>=90 �֣�ĸ
		�׸�����һ���ʼǱ����ԣ����Գɼ�>=60��ĸ�׸�����
		һ���ֻ������Գɼ�<60��û�����*/
		Scanner ning = new Scanner(System.in);
		System.out.println("������ɼ���");
			int A = ning.nextInt();
		if (A == 100) {
			System.out.println("һ̨��");
		} else if (A >= 90) {
			System.out.println("һ̨�ʼǱ�");
		} else if (A >= 60) {
			System.out.println("һ���ֻ�");
		} else {
			System.out.println("û������");
		}
		
	}

}
