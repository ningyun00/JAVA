package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_36 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*36. �Ӽ��̽���һ������������ 0 �˳�ѭ�����Ƚϲ����
		���е����ֵ����Сֵ*/
		Scanner ning = new Scanner(System.in);
			int A = 0,C = 0,B = 0,max = 0,min = 0;
		do {
			System.out.println("�������֣�");
				A = ning.nextInt();
			if (A > max) {
				max = A;	
			}
			if (min == 0 || A < min && A != 0) {
				min = A;
			}

		} while (A != 0);
		System.out.println("���ֵΪ��"+max+"\n��СֵΪ��"+min);
	}

}
