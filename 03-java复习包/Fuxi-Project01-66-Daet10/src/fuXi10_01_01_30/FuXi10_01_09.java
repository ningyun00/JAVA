package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//09.
		Scanner ning = new Scanner(System.in);
			int A,B = 1;
			do {
				System.out.print("");
					A = ning.nextInt();
					B *= A;
			} while (A != 0);
			System.out.println(B);
	}

}
