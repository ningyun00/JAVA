package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_20 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*20. �ӿ���̨����һ������������������Ľ׳ˡ�������
		�� 5���׳�Ϊ 5*4*3*2*1 �Ľ���� 120��
		 */
		Scanner ning = new Scanner(System.in);
		System.out.println("����һ��������׳ˣ�");
			int A = ning.nextInt();
			int B =1;
		for (int i = A; i >= 1; i--) {
			B *= i;
		}
			System.out.println(B);		
	}

}
