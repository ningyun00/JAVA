package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_21 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//21.
		Scanner ning = new Scanner(System.in);
			System.out.print("������ɼ���");
				int A =ning.nextInt();
		if (A >= 90) {
			System.out.println("A");
		} else if (A > 60 && A <= 89) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

}
