package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_27 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner ning = new Scanner(System.in);
		System.out.println("���������䣺");
			int A = ning.nextInt();
		System.out.println("�������Ա�");
			String B = ning.next();
		if (A > 7 || A >= 5 && B.equals("��")) {
			System.out.println("�ܰᶯ");	
		} else {
			System.out.println("����");
		}
	
	}

}
