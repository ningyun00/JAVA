package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_28 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*28. �Ӽ���������һ���������ж��Ƿ��ܱ� 3 �� 5 ������
		���������������� 3 �� 5 �ı�����
		�����������������
		�ܱ� 3 �� 5*/
		Scanner ning = new Scanner(System.in);
		System.out.println("������һ������");
			int A = ning.nextInt();
		if (A%3 == 0 || A%5 == 0) {
			System.out.println("������3��5�ı���");
		} else {
		System.out.println("�������ܱ� 3 �� 5 �е�����һ������");
		}
	
	}

}
