package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_54 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*54. ����Ҫ���û�����ѧ������Ŀ���뵽���� n �У����
		��������� 0����ô��ѭ�� n �ν��� n ��ѧ���ĳɼ�����
		���ּܷ�ƽ���֡����������ѧ������������Ϊ������
		*/
		Scanner ning = new Scanner(System.in);
			System.out.print("������ѧ��������");
				int A = ning.nextInt();
				int C = 0;
		if(A > 0) {	
			for (int i = 1; i <= A; i++) {
				System.out.print("������ѧ��"+i+"�ĳɼ���");
					int B = ning.nextInt();
					C += B;
			}
				System.out.println("�ܷ�Ϊ��"+C);
				System.out.println("ƽ����Ϊ��"+(double)(C/A));
		} else {
			System.out.println("ѧ������������Ϊ����");
		}
	
	}

}
