package fuXi10_01_01_30;

import java.util.Scanner;

import java.util.Random;

public class FuXi10_01_24 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//24.
		Scanner ning  = new Scanner(System.in);
		Random yun = new Random();
			System.out.print("��������Ļ�Ա���ţ�");
				int A = ning.nextInt();
				int B = yun.nextInt(9);
				int C = A/100%10;
		if (B == C) {
			System.out.println("�������˻�Ա");
		} else {
			System.out.println("�㲻�����˻�Ա");
		}
		
	}

}
