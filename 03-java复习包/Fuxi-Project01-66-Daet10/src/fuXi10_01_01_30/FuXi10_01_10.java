package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//10.
		Scanner ning = new Scanner(System.in);
			int B = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("�����һ���˵ĳɼ���");
				int A = ning.nextInt();
				B += A;
		}
		System.out.println(B/3);
	}

}
