package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_53 {

	public static void main(String[] args) {
//		 TODO �Զ����ɵķ������
//		53. ����һ�����������꣬�����������ܱ� 4 ��������
//		�ܱ� 100 �����������ܱ� 400 �������������һ������
//		�꣬����������һ����ƽ�ꡣ
		Scanner ning = new Scanner(System.in);
			System.out.print("��������ݣ�");
				int A = ning.nextInt();
		if(A%4 == 0 && A%100 != 0 || A%400 == 0) {
			System.out.println("��һ��������");
		}
		System.out.println("��һ����ƽ��");
	}

}
