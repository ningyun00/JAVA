package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_24 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*24. �齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ������������0-9��
		�ּ�Ϊ���˻�Ա*/
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
		System.out.print("�������Ļ�Ա���ţ�");
			int A = ning.nextInt();
			int C = yun.nextInt(9);
			int B = A/100%10;
		if (B == C) {
			System.out.println("��ϲ�������˻�Ա��");
		} else {
			System.out.println("��Ǹ�㲻�����˻�Ա��");
		}
			
	}

}
