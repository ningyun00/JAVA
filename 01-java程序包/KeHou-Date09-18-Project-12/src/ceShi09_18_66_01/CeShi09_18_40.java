package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_40 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//40. ������� 1 �� 1 �յ������������
		Scanner ning = new Scanner(System.in);
			int D1 = 0,D2 = 0,D3 = 0;
			int sum = 0;
		System.out.println("�����������ݣ�");
			int A = ning.nextInt();
		System.out.println("����������·ݣ�");
			int B = ning.nextInt();
		System.out.println("�������������ڣ�");
			int C = ning.nextInt();
		if (A%4 == 0 && A%100 != 0 || A%400 == 0) {
		} else {
			for (int i = B; i >= 1; i--) {
				switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
					D1 = 31*5;
					break;
				case 4:
				case 6:
				case 9:
					D2 = 30*2;
					break;
				case 2:
					D3 = 28;
					break;
				}
				
			}

		}sum = D1 + D2 + D3;
		System.out.println(sum+C);
	}

}
