package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_28 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//28.
		Scanner ning = new Scanner(System.in);
			System.out.println("������һ������");
				int A = ning.nextInt();
		if (A%3 == 0 || A%5 == 0) {
			System.out.println("������3��5�ı���");
		} else {
			System.out.println("�����ǲ���3��5�ı���");
		}
		
	}

}
