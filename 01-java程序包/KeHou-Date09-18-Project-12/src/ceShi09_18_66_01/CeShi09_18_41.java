package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_41 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//41. ����һ����λ����������Ҫ���̽������λ���е�
		//��λ��ʮλ����λ��ǧλ�ֱ������
		Scanner ning = new Scanner(System.in);
			int A1,A2,A3,A4;
		System.out.print("������һ����λ����");
			int A = ning.nextInt();
			A1 = A/1000;
			A2 = A/100%10;
			A3 = A/10%10;
			A4 = A%10;
		System.out.println("��λ:"+A4+"ʮλ:"+A3+"��λ:"+A2+"ǧλ:"+A1);
	}

}
