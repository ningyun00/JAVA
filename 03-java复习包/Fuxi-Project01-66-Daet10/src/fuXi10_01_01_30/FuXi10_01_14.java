package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_14 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//14.
		Scanner ning = new Scanner(System.in);		
			System.out.print("�����빫������");
				int A = ning.nextInt();
		if (A < 100) {
				A = A*20;
				System.out.println("�����۷���Ϊ��"+A);
		} else if (A < 500 && A > 100) {
			    A = A*20;
				System.out.println("����Ϊ��"+A*0.9);
		} else if (A>=500) {
				A = A*20;
			System.out.println("����Ϊ��"+A*0.8);	
		}
		
	}

}
