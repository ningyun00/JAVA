package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_20 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//20.
		Scanner ning = new Scanner(System.in);
			System.out.print("请输入一个整数：");
				int A = ning.nextInt();
				int B =1;
		for (int i = A; i > 0; i--) {
			B *= i;
		}
		System.out.println(B);
	}

}
