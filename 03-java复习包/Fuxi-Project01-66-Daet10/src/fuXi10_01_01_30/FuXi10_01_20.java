package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_20 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//20.
		Scanner ning = new Scanner(System.in);
			System.out.print("������һ��������");
				int A = ning.nextInt();
				int B =1;
		for (int i = A; i > 0; i--) {
			B *= i;
		}
		System.out.println(B);
	}

}
