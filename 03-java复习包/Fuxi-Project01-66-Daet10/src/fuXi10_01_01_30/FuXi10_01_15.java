package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_15 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//15.
		Scanner ning = new Scanner(System.in);		
			System.out.println("�������һ����");
				int A = ning.nextInt();
			System.out.println("������ڶ�����");
				int B = ning.nextInt();
			System.out.println("�������������");
				int C = ning.nextInt();
		if (A > B) {
			if (B > C) {
				System.out.println(C);
			} else {
				System.out.println(B);
			}
		} else if (B > A) {
			if (A > C) {
				System.out.println(C);
			} else {
				System.out.println(A);
			}
		} else if (C > A) {
			if (A > B) {
				System.out.println(B);
			} else {
				System.out.println(A);
			}
			
		}
		
	}

}
